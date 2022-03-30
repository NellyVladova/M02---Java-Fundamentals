package ExamPreparation;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder newPass = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] comArr = command.split(" ");
            String firstCommand = comArr[0];
            switch (firstCommand) {
                case "TakeOdd":
                    StringBuilder editedPass = new StringBuilder();
                    for (int i = 1; i < newPass.length(); i += 2) {
                        editedPass.append(newPass.charAt(i));
                    }
                    newPass = editedPass;
                    System.out.println(newPass);
                    break;
                case "Cut":
                    int index = Integer.parseInt(comArr[1]);
                    int length = Integer.parseInt(comArr[2]);

                    newPass.delete(index, index + length);
                    System.out.println(newPass);
                    break;
                case "Substitute":
                    String toReplace = comArr[1];
                    String replacement = comArr[2];
                    String editPass = newPass.toString();
                    if (editPass.contains(toReplace)) {
                        editPass = editPass.replaceAll(toReplace, replacement);
                        newPass = new StringBuilder(editPass);
                        System.out.println(newPass);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + newPass);
    }
}
