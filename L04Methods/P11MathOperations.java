package L04Methods;

import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(firstNum, symbol, secondNum));
    }
    public static int calculate(int a, char operation, int b){
        int result = 0;
        switch (operation){
            case '+':
                result = a+b;
                break;
            case '*':
                result = a*b;
                break;
            case '-':
                result = a-b;
                break;
            case '/':
                result = a/b;
                break;

        }
        return result;
    }
}
