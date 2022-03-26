package E09TextProcessing;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder finalString = new StringBuilder(input);
        int strength = 0;

        for (int i = 0; i < finalString.length(); i++) {
            char currentSymbol = finalString.charAt(i);
            if (currentSymbol == '>') {
                strength += Integer.parseInt("" + finalString.charAt(i + 1));
            } else if (currentSymbol != '>' && strength > 0){
                finalString.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(finalString);
    }
}
