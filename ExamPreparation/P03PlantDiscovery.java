package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new HashMap<>();
        Map<String, Double> rate = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("<->");
            String plant = inputArr[0];
            int rarity = Integer.parseInt(inputArr[1]);

            plantRarity.putIfAbsent(plant, 0);
            rate.putIfAbsent(plant, 0.0);
            plantRarity.put(plant, rarity);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] comArray = command.split("[: -]+");
            String firstCommand = comArray[0];
            String plantName = comArray[1];

            if (!rate.containsKey(plantName)) {
                System.out.println("error");
            }else {
                switch (firstCommand) {
                    case "Rate":
                        double currRating = Double.parseDouble(comArray[2]);
                        if (rate.get(plantName) == 0) {
                            rate.put(plantName, currRating);
                        } else {
                            double newRating = (rate.get(plantName) + currRating) / 2;
                            rate.put(plantName, newRating);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(comArray[2]);
                        plantRarity.put(plantName, newRarity);
                        break;
                    case "Reset":
                        rate.put(plantName, 0.0);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition: ");
        plantRarity.entrySet().stream().sorted((p1, p2) -> {
            int result = p2.getValue() - p1.getValue();
            if (result == 0) {
                double res = (rate.get(p2.getKey()) - rate.get(p1.getKey()));
                return (int) res;
            }
            return result;
        }).forEach(entry -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), entry.getValue(), rate.get(entry.getKey()));
        });
    }
}
