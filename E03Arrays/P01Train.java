package E03Arrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsNumber = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsNumber];
        int sum = 0;

        for (int i = 0; i < wagonsNumber; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            wagons[i] = peopleCount;
        }
        for (int num:wagons) {
            System.out.print(num + " ");
            sum+=num;
        }
        System.out.printf("\n%d\n", sum);
    }
}
