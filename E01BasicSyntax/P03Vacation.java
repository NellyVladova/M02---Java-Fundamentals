package E01BasicSyntax;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (groupType){
            case "Students":
                switch (day){
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = guestsNumber*price;
        if (guestsNumber >= 30 && groupType.equals("Students")) {
            totalPrice*=0.85;
        } else if (guestsNumber >= 100 && groupType.equals("Business")) {
            totalPrice-=price*10;
        } else if (guestsNumber >= 10 && guestsNumber <= 20 && groupType.equals("Regular")) {
            totalPrice*=0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
