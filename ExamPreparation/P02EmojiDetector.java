package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(input);
        int coolThreshold = 1;
        List<String> emojiList = new ArrayList<>();

        for (char currSymbol : input.toCharArray()) {
            if (Character.isDigit(currSymbol)) {
                coolThreshold *= Integer.parseInt(currSymbol + "");
            }
        }
        System.out.printf("Cool threshold: %d\n", coolThreshold);
        while (matcher.find()) {
            count++;
            String emoji = matcher.group("emoji");
            int emojiSum = 0;
            for (char symbol : emoji.toCharArray()){
                emojiSum+=(int) symbol;
            }
            if(emojiSum>coolThreshold){
                emojiList.add(matcher.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:\n", count);
        emojiList.forEach(emoji -> System.out.println(emoji));
    }
}
