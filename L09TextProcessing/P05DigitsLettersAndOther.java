package L09TextProcessing;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if(Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if(Character.isLetter(currentSymbol)){
                letters.append(currentSymbol);
            }else {
                symbols.append(currentSymbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}