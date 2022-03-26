package E09TextProcessing;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder encryptMessage = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            char currentSymbol = (char) (input[i] + 3);
            encryptMessage.append(currentSymbol);
        }

        System.out.println(encryptMessage);
    }
}
