package E04Methods;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (isValidForLength(password) && consistLettersAndDigits(password) && haveMOreThanTwoDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!isValidForLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveMOreThanTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isValidForLength(String pass) {

        return pass.length() >= 6 && pass.length() <= 10;
    }

    private static boolean consistLettersAndDigits(String pass) {
        for (char symbol : pass.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean haveMOreThanTwoDigits(String pass) {
        int digitCount = 0;
        for (char symbol:pass.toCharArray()) {
            if(Character.isDigit(symbol)){
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
