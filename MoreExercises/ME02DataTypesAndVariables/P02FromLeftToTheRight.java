package MoreExercises.ME02DataTypesAndVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //25/100???
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int sum = 0;
            long firstNum = Long.parseLong(input[0]);
            long secondNum = Long.parseLong(input[1]);
            if (firstNum>secondNum) {
                for (int j = 0; j < input[0].length(); j++) {
                    long currNum = firstNum % 10;
                    sum += currNum;
                    firstNum /= 10;
                }
            } else {
                for (int j = 0; j < input[1].length(); j++) {
                    long currNum = secondNum % 10;
                    sum += currNum;
                    secondNum /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
