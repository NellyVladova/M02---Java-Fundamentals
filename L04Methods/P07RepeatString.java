package L04Methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, count));
    }

    public static String repeatString(String input, int numberOfRepeat){
        String result = "";
        for (int i = 0; i < numberOfRepeat; i++) {
            result+=input;
        }
        return result;
    }
}
