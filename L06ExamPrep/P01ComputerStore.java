package L06ExamPrep;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalPrice = 0;
        double priceWithoutTaxes = 0;
        double taxes = 0;
        while (!command.equals("special")) {
            if(command.equals("regular")){
                break;
            }
            double price = Double.parseDouble(command);

            if (price < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            taxes += (price * 0.20);
            priceWithoutTaxes += price;

            command = scanner.nextLine();
        }
        totalPrice = priceWithoutTaxes + taxes;
        if (command.equals("special")) {
            totalPrice *= 0.90;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        }
        if(totalPrice>0){
            printOrder(priceWithoutTaxes, taxes, totalPrice);
        }
    }

    private static void printOrder(double priceWithoutTaxes, double taxes, double totalPrice) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", priceWithoutTaxes);
        System.out.printf("Taxes: %.2f$\n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$\n", totalPrice);
    }
}
