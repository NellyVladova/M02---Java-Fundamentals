package L07ObjectsAndClasses;

import java.util.*;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(" ");
        Random randomNum = new Random();

        for (int i = 0; i < wordsArray.length; i++) {
            int numX = randomNum.nextInt(wordsArray.length);
            int numY = randomNum.nextInt(wordsArray.length);

            String oldWord = wordsArray[numX];
            wordsArray[numX] = wordsArray[numY];
            wordsArray[numY] = oldWord;
        }
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }
    }
}
