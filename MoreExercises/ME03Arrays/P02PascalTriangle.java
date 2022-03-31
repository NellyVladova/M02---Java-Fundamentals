package MoreExercises.ME03Arrays;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] triangle = new int[n];
        for (int i = 1; i <= n; i++) {
            int[] newArr = new int[i];
            for (int j = 0; j < newArr.length; j++) {
                if (j == newArr.length - 1) {
                    newArr[j] = 1;
                } else if (j == 0) {
                    newArr[j] = 1;
                } else {
                    int next = triangle[j - 1];

                    newArr[j] = triangle[j] + next;

                }
            }
            for (int j = 0; j < newArr.length; j++) {
                triangle[j] = newArr[j];
                System.out.printf("%d ", triangle[j]);
            }
            System.out.println();
        }
    }
}
