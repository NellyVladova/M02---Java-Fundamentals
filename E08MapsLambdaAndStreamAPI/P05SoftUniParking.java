package E08MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> usersRegister = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String firstCommand = command[0];
            String username = command[1];

            if (firstCommand.equals("register")) {
                String licensePlateNum = command[2];
                if(usersRegister.containsKey(username)){
                    System.out.printf("ERROR: already registered with plate number %s\n", licensePlateNum);
                }else {
                    usersRegister.put(username, licensePlateNum);
                    System.out.printf("%s registered %s successfully\n", username, licensePlateNum);
                }

            } else if (firstCommand.equals("unregister")) {
                if (!usersRegister.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found\n", username);
                }else {
                    usersRegister.remove(username);
                    System.out.printf("%s unregistered successfully\n", username);
                }
            }
        }

        usersRegister.forEach((username, licensePlate) -> System.out.println(username + " => " + licensePlate));
    }
}
