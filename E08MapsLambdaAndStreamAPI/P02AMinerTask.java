package E08MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!resources.containsKey(command)){
                resources.put(command, quantity);
            }else {
               resources.put(command, resources.get(command) + quantity);
            }
            command = scanner.nextLine();
        }
        resources.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
