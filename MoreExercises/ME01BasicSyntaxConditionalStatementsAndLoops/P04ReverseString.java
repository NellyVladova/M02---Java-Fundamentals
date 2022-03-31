package MoreExercises.ME01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String insideOut = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            char symbol = word.charAt(i);
            insideOut +=symbol;
        }
        System.out.println(insideOut);
    }
}
