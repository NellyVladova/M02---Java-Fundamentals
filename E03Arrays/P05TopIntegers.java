package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= numberArray.length - 1; i++) {
            int currentNum = numberArray[i];
            if (i == numberArray.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j <= numberArray.length - 1; j++) {
                int nextNum = numberArray[j];
                if (currentNum > nextNum) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
