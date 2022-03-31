package MoreExercises.ME04Methods;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        sign(num1, num2, num3);
    }

    public static void sign(int n1, int n2, int n3) {
        if (n1 < 0) {
            if (n2 < 0) {
                if (n3 < 0) {
                    System.out.println("negative");
                } else if(n3 > 0){
                    System.out.println("positive");
                }else {
                    System.out.println("zero");
                }
            }else if(n2 > 0){
                if(n3 < 0){
                    System.out.println("positive");
                }else if(n3 > 0 ){
                    System.out.println("negative");
                }else {
                    System.out.println("zero");
                }
            }else {
                System.out.println("zero");
            }
        } else if(n1 > 0){
            if (n2 < 0) {
                if (n3 < 0) {
                    System.out.println("positive");
                } else if(n3 > 0){
                    System.out.println("negative");
                }else {
                    System.out.println("zero");
                }
            }else if(n2 > 0){
                if(n3 < 0){
                    System.out.println("negative");
                }else if(n3 > 0 ){
                    System.out.println("positive");
                }else {
                    System.out.println("zero");
                }
            }
        }else {
            System.out.println("zero");
        }
    }
}
