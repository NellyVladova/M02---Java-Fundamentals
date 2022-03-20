package E02DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int totalAmount = 0;
        int days = 0;
        while (yield>=100){
            int workedSpices = yield-26;
            totalAmount+=workedSpices;
            yield-=10;
            days++;
        }
        if (totalAmount >= 26) {
            totalAmount-=26;
        }
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
