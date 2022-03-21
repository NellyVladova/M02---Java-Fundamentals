package E04Methods;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (sumIsDivisibleBy8(i) && hasAnOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumIsDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            int currentDigit = num % 10;
            sum += currentDigit;
            num /= 10;
        }

        return (sum % 8 == 0);
    }

    private static boolean hasAnOddDigit(int num){
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit % 2 == 1) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
