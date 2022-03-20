package E01BasicSyntax;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = lostGameCount / 2;
        int mouseCount = lostGameCount / 3;
        int keyboardCount = lostGameCount / 6;
        int displayCount = lostGameCount / 12;
        double headset = headsetCount * headsetPrice;
        double mouse = mouseCount * mousePrice;
        double keyboard = keyboardCount * keyboardPrice;
        double display = displayCount * displayPrice;

        double totalPrice = headset + mouse + keyboard + display;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
