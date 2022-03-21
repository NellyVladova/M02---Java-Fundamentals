package L04Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(numberOne, numberTwo);
                break;
            case "multiply":
                multiply(numberOne, numberTwo);
                break;
            case "subtract":
                subtract(numberOne, numberTwo);
                break;
            case "divide":
                divide(numberOne, numberTwo);
                break;
        }

    }

    public static void add(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
    }

    public static void multiply(int numOne, int numTwo) {
        System.out.println(numOne * numTwo);
    }

    public static void subtract(int numOne, int numTwo) {
        System.out.println(numOne - numTwo);
    }

    public static void divide(int numOne, int numTwo) {
        System.out.println(numOne / numTwo);
    }
}
