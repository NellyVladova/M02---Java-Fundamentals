package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //?????? 30/100
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int maxOnes = Integer.MIN_VALUE;
        boolean cloneThem = false;
        int line = 0;
        int[] finalArray = new int[length];
        boolean printIt = false;

        while (!command.equals("Clone them!")) {
            int[] number = Arrays.stream(command.split("!")).mapToInt(Integer::parseInt).toArray();
            int countForOnes = 0;
            cloneThem = false;

            for (int i = 0; i <= number.length - 1; i++) {
                if (number[i] == 1) {
                    countForOnes++;
                }
                if (countForOnes > maxOnes) {
                    maxOnes = countForOnes;
                    cloneThem = true;
                }
            }
            if (cloneThem) {
                line++;
                finalArray = number;
                printIt = true;
            }
            command = scanner.nextLine();
        }
        if (printIt) {
            System.out.printf("Best DNA sample %d with sum: %d.\n", line, maxOnes);
            for (int i = 0; i <= finalArray.length - 1; i++) {
                System.out.print(finalArray[i] + " ");
            }
        }
    }
}
