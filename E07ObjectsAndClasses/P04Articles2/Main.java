package E07ObjectsAndClasses.P04Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articlesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article currentArticle = new Article(title, content, author);
            articlesList.add(currentArticle);

        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articlesList.sort(Comparator.comparing(Article::getTitle));
        } else if (command.equals("content")) {
            articlesList.sort(Comparator.comparing(Article::getContent));
        } else if (command.equals("author")) {
            articlesList.sort(Comparator.comparing(Article::getAuthor));
        }

        articlesList.forEach(System.out::println);
    }
}
