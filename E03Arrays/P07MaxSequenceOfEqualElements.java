package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int length = 1;
        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < numberArray.length ; i++) {
            if(numberArray[i]==numberArray[i-1]){
                length++;
            }else {
                startIndex = i;
                length = 1;
            }
            if(length>maxLength){
                maxLength = length;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i <bestStart+maxLength ; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }
}
