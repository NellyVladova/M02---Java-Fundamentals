package MoreExercises.ME01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int midNum = 0;

        if (num1 > maxNum) {
            maxNum = num1;
        }
        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num1 < minNum) {
            minNum = num1;
        }
        if (num2 < minNum) {
            minNum = num2;
        }
        if (num3 < minNum) {
            minNum = num3;
        }
        if (maxNum == num1  && minNum == num2) {
            midNum = num3;
        } else if (maxNum == num1 && minNum == num3) {
            midNum = num2;
        } else if (maxNum == num2 && minNum == num1) {
            midNum = num3;
        }else if(maxNum == num2  && minNum == num3){
            midNum = num1;
        }else if(maxNum == num3  && minNum == num1){
            midNum = num2;
        } else if (maxNum == num3 && minNum == num2) {
            midNum = num1;
        }
        System.out.println(maxNum);
        System.out.println(midNum);
        System.out.println(minNum);
    }
}
