package L03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[numArray.length - 1];

        for (int i = 0; i < numArray.length; i++) {
            if (numArray.length == 1) {
                break;
            }
            if (i == numArray.length - 1) {
                int[] condensedArrNew = new int[condensed.length - 1];
                i = -1;
                numArray = condensed;
                condensed = condensedArrNew;
            }else {
                condensed[i] = numArray[i] + numArray[i+1];
            }
        }
        System.out.println(numArray[0]);
    }
}
