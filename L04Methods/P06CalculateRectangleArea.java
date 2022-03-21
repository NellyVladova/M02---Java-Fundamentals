package L04Methods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println(calculateRectangleArea(length, width));
    }

    public static int calculateRectangleArea(int a, int b) {
        return a * b;
    }
}
