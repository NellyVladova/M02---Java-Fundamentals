package E04Methods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorialDivision(firstNum, secondNum));
    }

    private static double factorialDivision(int firstNum, int secondNum) {
        long firstFactorial = 1;
        long secondFactorial = 1;
        for (int i = 1; i <= firstNum; i++) {
            firstFactorial *= i;
        }
        for (int i = 1; i <= secondNum; i++) {
            secondFactorial *= i;
        }
        double result = firstFactorial * 1.0 / secondFactorial;

        return result;
    }
}
