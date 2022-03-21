package E04Methods;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 == 0) {
            int firstMiddleIndex = text.length() / 2 - 1;
            int secondMiddleIndex = text.length() / 2;
            System.out.println(text.charAt(firstMiddleIndex) + "" + text.charAt(secondMiddleIndex));
        } else {
            int middleIndex = text.length() / 2;
            System.out.println(text.charAt(middleIndex));
        }
    }
}
