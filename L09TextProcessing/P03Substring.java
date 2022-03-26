package L09TextProcessing;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String remove = scanner.nextLine();
        String input = scanner.nextLine();
        int index = input.indexOf(remove);

        while (index!=-1) {
            input = input.replace(remove, "");
            index = input.indexOf(remove);
        }

        System.out.println(input);
    }
}
