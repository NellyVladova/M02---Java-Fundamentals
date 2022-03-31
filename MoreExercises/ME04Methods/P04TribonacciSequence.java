package MoreExercises.ME04Methods;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] tribonacciArr = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                tribonacciArr[i] = 1;
            } else if (i == 2) {
                tribonacciArr[i] = 2;
            } else {
                tribonacciArr[i] = tribonacciSum(tribonacciArr[i - 1], tribonacciArr[i - 2], tribonacciArr[i - 3]);
            }
        }
        for (int i = 0; i < tribonacciArr.length; i++) {
            System.out.printf("%d ", tribonacciArr[i]);
        }
    }

    public static int tribonacciSum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
