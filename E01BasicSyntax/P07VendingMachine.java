package E01BasicSyntax;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalSum = 0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f\n", coins);
            } else {
                totalSum += coins;
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            boolean money = true;
            switch (product) {
                case "Nuts":
                    if (totalSum < 2) {
                        System.out.println("Sorry, not enough money");
                        money = false;
                    } else {
                        totalSum -= 2.0;
                    }
                    break;
                case "Water":
                    if (totalSum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        money = false;
                    } else {
                        totalSum -= 0.70;
                    }
                    break;
                case "Crisps":
                    if (totalSum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        money = false;
                    } else {
                        totalSum -= 1.5;
                    }
                    break;
                case "Soda":
                    if (totalSum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        money = false;
                    } else {
                        totalSum -= 0.8;
                    }
                    break;
                case "Coke":
                    if (totalSum < 1) {
                        System.out.println("Sorry, not enough money");
                        money = false;
                    } else {
                        totalSum -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    money = false;
                    break;
            }
            if (!money) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s\n", product);
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
