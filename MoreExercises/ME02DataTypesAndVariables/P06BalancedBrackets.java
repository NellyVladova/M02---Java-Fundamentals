package MoreExercises.ME02DataTypesAndVariables;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int openingBracketCount = 0;
        int closingBracketCount = 0;
        boolean error = false;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(") && closingBracketCount == 0) {
                openingBracketCount++;
            } else if (input.equals(")") && openingBracketCount == 1) {
                openingBracketCount = 0;
                closingBracketCount = 0;
            } else if (input.equals(")") && openingBracketCount == 0) {
                error = true;
                break;
            }
        }
        if ((closingBracketCount != openingBracketCount) || error) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
