package L06ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            List<String> input = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstString = input.get(0);
            String product = input.get(1);
            switch (firstString) {
                case "Urgent":
                    if (!productList.contains(product)) {
                        productList.add(0, product);
                    }
                    break;
                case "Unnecessary":
                    productList.remove(product);
                    break;
                case "Correct":
                    String newProduct = input.get(2);
                    if (productList.contains(product)) {
                        int index = productList.indexOf(product);
                        productList.set(index, newProduct);
                    }
                    break;
                case "Rearrange":
                    if (productList.contains(product)) {
                        productList.remove(product);
                        productList.add(product);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print(String.join(", ", productList));

    }
}
