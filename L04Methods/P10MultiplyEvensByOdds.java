package L04Methods;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    public static int getMultipleOfEvensAndOdds(int num) {
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);

        return evenSum * oddSum;
    }

    public static int getEvenSum(int num) {
        String intToString = Integer.toString(num);
        int sum = 0;

        int[] array = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static int getOddSum(int num){
        String intToString = Integer.toString(num);
        int sum = 0;

        int[] array = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                sum+=array[i];
            }
        }
        return sum;
    }
}
