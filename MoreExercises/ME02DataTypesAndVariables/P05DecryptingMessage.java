package MoreExercises.ME02DataTypesAndVariables;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 1; i <= n; i++) {
            char decryptedSymbol = scanner.next().charAt(0);
            decryptedSymbol+=key;
            message += decryptedSymbol;
        }
        System.out.println(message);
    }
}
