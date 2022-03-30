package ExamPreparation;

import java.util.Collections;
import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretMessage = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] comArr = command.split(":\\|:");
            String firstCom = comArr[0];
            switch (firstCom) {
                case "InsertSpace":
                    int index = Integer.parseInt(comArr[1]);
                    String firstSubstring = secretMessage.substring(0, index);
                    String secondSubstring = secretMessage.substring(index);
                    secretMessage = firstSubstring + " " + secondSubstring;
                    System.out.println(secretMessage);
                    break;
                case "Reverse":
                    String substring = comArr[1];
                    if (secretMessage.contains(substring)) {
                        secretMessage = secretMessage.replaceFirst(substring, "");
                        String reversedStr = "";
                        for (int i = substring.length()-1; i >= 0; i--) {
                            reversedStr += (substring.toCharArray()[i]);
                        }
                        secretMessage += reversedStr;
                        System.out.println(secretMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldSubstring = comArr[1];
                    String replacement = comArr[2];
                    secretMessage = secretMessage.replaceAll(oldSubstring, replacement);
                    System.out.println(secretMessage);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + secretMessage);
    }
}
