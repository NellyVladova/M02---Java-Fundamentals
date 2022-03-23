package E07ObjectsAndClasses.P01AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Messages message = new Messages();

        for (int i = 0; i < n; i++) {
            message.randomMessage();
        }
    }
}
