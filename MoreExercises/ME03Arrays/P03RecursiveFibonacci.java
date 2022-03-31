package MoreExercises.ME03Arrays;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] fibonacciArr = new int[number];
        for (int i = 0; i < fibonacciArr.length; i++) {
            if(i==0 || i==1){
                fibonacciArr[i] = 1;
            }else {
                fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i - 2];
            }
        }
        System.out.println(fibonacciArr[number - 1]);
    }
}
