package L09TextProcessing;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordToReplace = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            for (String currentWord : wordToReplace) {
                if (text.contains(currentWord)) {
                    int count = currentWord.length();
                    String replacementWord = repeatStr("*", count);
                    text = text.replace(currentWord, replacementWord);

                }
            }
        }
        System.out.println(text);
    }

    public static String repeatStr(String word, int counter){
        String[] replacement = new String[counter];
        for (int i = 0; i < counter; i++) {
            replacement[i] = word;
        }

        return String.join("", replacement);
    }
}
