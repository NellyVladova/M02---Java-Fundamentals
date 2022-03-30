package ExamPreparation;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> piratesInfo = new TreeMap<>();
        while (!input.equals("Sail")) {
            //city->population->gold
            String[] inputArr = input.split("\\|\\|");
            String city = inputArr[0];
            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);
            if(piratesInfo.containsKey(city)){
                List<Integer> increasedList = new ArrayList<>();
                increasedList.add(piratesInfo.get(city).get(0) + population);
                increasedList.add(piratesInfo.get(city).get(1) + gold);
                piratesInfo.put(city, increasedList);
            }else {
                List<Integer> toPut = new ArrayList<>();
                toPut.add(population);
                toPut.add(gold);
                piratesInfo.put(city, toPut);
            }
            input = scanner.nextLine();
        }
        String events = scanner.nextLine();
        while (!events.equals("End")) {
            String[] eventsArr = events.split("=>");
            String firstCom = eventsArr[0];
            String town = eventsArr[1];
            switch (firstCom){
                case "Plunder":
                    int people = Integer.parseInt(eventsArr[2]);
                    int goldQuantity = Integer.parseInt(eventsArr[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, goldQuantity, people);
                    int currPeople = piratesInfo.get(town).get(0);
                    int currGold = piratesInfo.get(town).get(1);
                    if(currPeople - people <=0 || currGold - goldQuantity <= 0){
                        piratesInfo.remove(town);
                        System.out.printf("%s has been wiped off the map!\n", town);
                    }else {
                        piratesInfo.get(town).set(0, piratesInfo.get(town).get(0) - people);
                        piratesInfo.get(town).set(1, piratesInfo.get(town).get(1) - goldQuantity);
                    }
                    break;
                case "Prosper":
                    int gold = Integer.parseInt(eventsArr[2]);
                    if(gold<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        int increasedGold = piratesInfo.get(town).get(1) + gold;
                        piratesInfo.get(town).set(1, increasedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, town, increasedGold);
                    }
                    break;
            }
            events = scanner.nextLine();
        }
        int mapSize = piratesInfo.size();
        if(mapSize>0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", mapSize);
            piratesInfo.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(1).compareTo(e1.getValue().get(1)))
                    .forEach(entry -> {
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
                    });
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
