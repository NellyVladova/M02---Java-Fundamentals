package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= numberArray.length - 1; i++) {
            int currentNumber = numberArray[i];
            for (int j = i+1; j <=numberArray.length - 1 ; j++) {
                int nextNumber = numberArray[j];
                if (currentNumber + nextNumber == sumNumber) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
