package L09TextProcessing;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder finalString = new StringBuilder();
        for (String currWord : input){
            int counter = currWord.length();
            for (int i = 0; i < counter; i++) {
                finalString.append(currWord);
            }
        }
        System.out.println(finalString);
    }
}
