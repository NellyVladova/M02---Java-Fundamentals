package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            List<String> comList = Arrays.stream(command.split("\\|")).collect(Collectors.toList());
            String firstCom = comList.get(0);
            switch (firstCom) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(comList.get(1));
                    String toMove = encryptedMessage.substring(0, numberOfLetters);
                    encryptedMessage = encryptedMessage.replace(toMove, "");
                    encryptedMessage = encryptedMessage + toMove;
                    break;
                case "Insert":
                    int index = Integer.parseInt(comList.get(1));
                    String toInsert = comList.get(2);
                    String firstSubstring = encryptedMessage.substring(0, index);
                    String secondSubstring = encryptedMessage.substring(index);
                    encryptedMessage = firstSubstring + toInsert + secondSubstring;

                    break;
                case "ChangeAll":
                    String substring = comList.get(1);
                    String replacement = comList.get(2);

                    encryptedMessage = encryptedMessage.replace(substring, replacement);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s\n", encryptedMessage);
    }
}
