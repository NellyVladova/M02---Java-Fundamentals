package MoreExercises.ME04Methods;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        int area1 = findArea(x1, y1);
        int area2 = findArea(x2, y2);
        if (area1 < area2) {
            System.out.printf("(%d, %d)\n", x1, y1);
        } else if(area1 > area2){
            System.out.printf("(%d, %d)\n", x2, y2);
        }else {
            System.out.printf("(%d, %d)\n", x1, y1);
        }
    }
    public static int findArea(int x, int y){
        return x * y;
    }
}
