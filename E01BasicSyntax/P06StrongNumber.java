package E01BasicSyntax;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNum = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int i = lastDigit; i >=1 ; i--) {
                factorial *=i;
            }
            sum+=factorial;
            number/=10;
        }
        if (sum == startNum) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
