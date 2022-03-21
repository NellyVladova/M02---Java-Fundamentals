package E04Methods;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        vowelsCount(input);
    }

    private static void vowelsCount(String text) {
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if(currentSymbol=='a' || currentSymbol=='e' || currentSymbol=='i' || currentSymbol=='o' || currentSymbol=='u' || currentSymbol=='y'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
