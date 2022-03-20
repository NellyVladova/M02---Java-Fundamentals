package E01BasicSyntax;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String correctPass = "";
        int count = 0;
        boolean userIsBlocked = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            correctPass += symbol;
        }
        while (!password.equals(correctPass)) {
            count++;
            if (count == 4) {
                userIsBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }
        if (userIsBlocked) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
