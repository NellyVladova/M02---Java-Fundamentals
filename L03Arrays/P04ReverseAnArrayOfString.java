package L03Arrays;

import java.util.Scanner;

public class P04ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String firstElement = input[i];

            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = firstElement;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
