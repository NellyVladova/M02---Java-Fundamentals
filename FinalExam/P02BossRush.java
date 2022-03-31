package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("\\|(?<name>[A-Z]{4,})\\|:#(?<title>[A-z][a-z]+ [A-Za-z]+)#");
        Matcher matcher = null;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);
            if(matcher.find()){
                int nameLength = matcher.group("name").length();
                int titleLength = matcher.group("title").length();
                String name = matcher.group("name");
                String title = matcher.group("title");
                System.out.printf("%s, The %s\n", name, title);
                System.out.printf(">> Strength: %d\n", nameLength);
                System.out.printf(">> Armor: %d\n", titleLength);
            }else {
                System.out.println("Access denied!");
            }
        }
    }
}
