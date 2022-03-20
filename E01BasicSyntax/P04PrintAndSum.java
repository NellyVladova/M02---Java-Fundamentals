package E01BasicSyntax;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= finalNum; i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.printf("\nSum: %d", sum);
    }
}
