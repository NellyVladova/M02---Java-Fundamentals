package E10RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double pricePerOne = Double.parseDouble(matcher.group("price"));
                totalIncome+=(quantity*pricePerOne);
                System.out.printf("%s: %s - %.2f\n", name, product, quantity*pricePerOne);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f\n", totalIncome);
    }
}
