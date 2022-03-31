package MoreExercises.ME01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        boolean noMoney = false;
        double totalPrice = 0;

        while (!command.equals("Game Time")){
            boolean notFound = false;

            switch (command){
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    notFound = true;
                    break;
            }
            if (notFound) {
                System.out.println("Not Found");
            }else {
                if (price > budget) {
                    System.out.println("Too Expensive");
                }else {
                    budget-=price;
                    totalPrice+=price;
                    System.out.printf("Bought %s\n", command);
                }
            }
            if (budget <= 0) {
                noMoney = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (noMoney) {
            System.out.println("Out of mo-ney!");
        }else {
            System.out.printf("Total spent: $%.2f. ", totalPrice);
            System.out.printf("Remaining: $%.2f", budget);
        }
    }
}
