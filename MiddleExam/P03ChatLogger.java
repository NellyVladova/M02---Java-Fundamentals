package MiddleExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> chatList = new ArrayList<>();

        while (!input.equals("end")) {
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String firstCommand = commands.get(0);

            switch (firstCommand) {
                case "Chat":
                    String messageToAdd = commands.get(1);
                    chatList.add(messageToAdd);
                    break;
                case "Delete":
                    String messageToRemove = commands.get(1);
                    chatList.remove(messageToRemove);
                    break;
                case "Edit":
                    String messageToEdit = commands.get(1);
                    String editedVersion = commands.get(2);
                    if(chatList.contains(messageToEdit)){
                        int indexToEdit = chatList.indexOf(messageToEdit);
                        chatList.set(indexToEdit, editedVersion);
                    }
                    break;
                case "Pin":
                    String messageToPin = commands.get(1);
                    if (chatList.contains(messageToPin)) {
                        chatList.remove(messageToPin);
                        chatList.add(messageToPin);
                    }
                    break;
                case "Spam":
                    int counter = commands.size()-1;
                    for (int i = 1; i <= counter; i++) {
                        String messageToSpam = commands.get(i);
                        chatList.remove(messageToSpam);
                        chatList.add(messageToSpam);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < chatList.size(); i++) {
            System.out.println(chatList.get(i));
        }
    }
}
