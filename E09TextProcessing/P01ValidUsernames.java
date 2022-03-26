package E09TextProcessing;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        for (String users : input) {
            if(isValid(users)){
                System.out.println(users);
            }
        }
    }

    public static boolean isValid(String str) {
        if (str.length() < 3 || str.length() > 16) {
            return false;
        } else {
            for (char currSymbol : str.toCharArray()) {
                if (!(currSymbol == '-' || currSymbol == '_' || Character.isLetterOrDigit(currSymbol))) {
                    return false;
                }
            }
        }
        return true;
    }
}
