package L03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                evenSum+=numArray[i];
            }else {
                oddSum+=numArray[i];
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
