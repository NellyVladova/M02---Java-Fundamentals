package E07ObjectsAndClasses.P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String firstCom = command.split(": ")[0];
            String newValue = command.split(": ")[1];

            if(firstCom.equals("Edit")){
                article.setContent(newValue);
            }else if(firstCom.equals("ChangeAuthor")){
                article.setAuthor(newValue);
            } else if (firstCom.equals("Rename")) {
                article.setTitle(newValue);
            }
        }
        System.out.println(article);
    }
}
