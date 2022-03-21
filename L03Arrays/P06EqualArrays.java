package L03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int minLength = Math.min(array1.length, array2.length);
        int sum = 0;
        boolean areNotIdentical = false;

        for (int i = 0; i < minLength; i++) {
            sum+=array1[i];
            if(array1[i]!=array2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }
        if(!areNotIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
