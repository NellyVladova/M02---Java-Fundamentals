package E08MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Double> price = new LinkedHashMap<>();
        Map<String, Integer> quantity = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String product = command.split(" ")[0];
            double productPrice = Double.parseDouble(command.split(" ")[1]);
            int productQuantity = Integer.parseInt(command.split(" ")[2]);

            price.put(product, productPrice);
            if(!quantity.containsKey(product)) {
                quantity.put(product, productQuantity);
            }else {
                quantity.put(product, quantity.get(product) + productQuantity);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : price.entrySet()){
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()*quantity.get(entry.getKey()));
        }
    }
}
