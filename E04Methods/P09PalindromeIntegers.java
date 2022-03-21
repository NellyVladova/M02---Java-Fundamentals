package E04Methods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (!isPalindrome(input)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String number) {
        String reversedString = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedString+=number.charAt(i);
        }
        return number.equals(reversedString);
    }
}
