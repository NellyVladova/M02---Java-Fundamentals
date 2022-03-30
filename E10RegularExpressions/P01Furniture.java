package E10RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> furnitureList = new ArrayList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)");
        Matcher matcher = null;
        while (!input.equals("Purchase")) {
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                furnitureList.add(matcher.group("furnitureName"));
                double pricePerOne = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalSum += (pricePerOne*quantity);
            }
            input = scanner.nextLine();
        }
        print(furnitureList, totalSum);
    }
    public static void print(List list, double sum){
        System.out.println("Bought furniture:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
