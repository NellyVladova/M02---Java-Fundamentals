package E02DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentLiters = 0;
        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if ((currentLiters+quantity)<= 255) {
                currentLiters+=quantity;
            }else  {
                System.out.println("Insufficient capacity!");
                continue;
            }
        }
        System.out.println(currentLiters);
    }
}
