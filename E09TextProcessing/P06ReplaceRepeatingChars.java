package E09TextProcessing;

import java.util.List;
import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        StringBuilder finalString = new StringBuilder();

        if (input == null || input.length() == 0) {
            return;
        }

        char previousChar = input.charAt(0);
        finalString.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (currentCharacter != previousChar) {
                finalString.append(currentCharacter);
                previousChar = currentCharacter;
            }
        }

        System.out.println(finalString);
    }
}
