package E02DataTypesAndVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i < (97 + number); i++) {
            char symbol1 = (char) i;
            for (int j = 97; j < (97 + number); j++) {
                char symbol2 = (char) j;
                for (int k = 97; k < (97 + number); k++) {
                    char symbol3 = (char) k;
                    System.out.printf("%c%c%c\n", symbol1, symbol2, symbol3);
                }
            }
        }
    }
}
