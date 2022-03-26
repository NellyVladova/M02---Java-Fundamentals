package E08MapsLambdaAndStreamAPI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new TreeMap<>();
        boolean isOver = false;

        while (!isOver) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String materialType = input[i + 1].toLowerCase();

                if (materialType.equals("shards") || materialType.equals("fragments") || materialType.equals("motes")) {
                    int currentQuantity = materials.get(materialType);
                    materials.put(materialType, currentQuantity +  quantity);

                    if (materials.get(materialType) >= 250) {
                        if (materialType.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (materialType.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materials.put(materialType, materials.get(materialType) - 250);
                        isOver = true;
                        break;
                    }
                } else {
                    if (!junks.containsKey(materialType)) {
                        junks.put(materialType, quantity);
                    } else {
                        int currentQuantity = junks.get(materialType);
                        junks.put(materialType, currentQuantity + quantity);
                    }
                }
            }
        }

        materials.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
