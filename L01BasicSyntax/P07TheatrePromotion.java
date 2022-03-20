package L01BasicSyntax;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean invalidAge = false;

        if (dayType.equals("weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else {
                invalidAge = true;
            }
            if (invalidAge) {
                System.out.println("Error!");
            } else {
                System.out.printf("%d$", price);
            }
        } else if (dayType.equals("weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else {
                invalidAge = true;
            }
            if (invalidAge) {
                System.out.println("Error!");
            } else {
                System.out.printf("%d$", price);
            }
        } else if (dayType.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            } else {
                invalidAge = true;
            }
            if (invalidAge) {
                System.out.println("Error!");
            } else {
                System.out.printf("%d$", price);
            }
        }else {
            System.out.println("Error!");
        }
    }
}
