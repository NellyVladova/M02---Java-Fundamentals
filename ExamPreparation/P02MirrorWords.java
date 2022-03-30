package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})(\\1)(\\1)(?<secondWord>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorWords = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder reversedSecondWord = new StringBuilder(secondWord);
            reversedSecondWord.reverse();
            count++;
            if (firstWord.equals(reversedSecondWord.toString())) {
                mirrorWords.add(firstWord + " <=> " + secondWord);
            }
        }
        if (count != 0) {
            System.out.printf("%d word pairs found!\n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if (count > 0 && mirrorWords.size() > 0) {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWords));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
