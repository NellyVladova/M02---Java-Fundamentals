package ExamPreparation;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputInfo = scanner.nextLine().split("\\|");
            String carType = inputInfo[0];
            int mileage = Integer.parseInt(inputInfo[1]);
            int fuel = Integer.parseInt(inputInfo[2]);
            List<Integer> toPut = new ArrayList<>();
            toPut.add(mileage);
            toPut.add(fuel);
            carsMap.put(carType, toPut);
        }
        //name->mileage->fuel
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] comArr = command.split(" : ");
            String firstCom = comArr[0];
            String car = comArr[1];
            switch (firstCom) {
                case "Drive":
                    int distance = Integer.parseInt(comArr[2]);
                    int neededFuel = Integer.parseInt(comArr[3]);
                    int currFuel = carsMap.get(car).get(1);
                    int currMileage = carsMap.get(car).get(0);
                    if (currFuel < neededFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsMap.get(car).set(0, currMileage + distance);
                        carsMap.get(car).set(1, currFuel - neededFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, neededFuel);
                    }
                    if (carsMap.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!\n", car);
                        carsMap.remove(car);
                    }
                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(comArr[2]);
                    int max = 75;
                    int currentFuel = carsMap.get(car).get(1);
                    if (currentFuel + fuelToRefill > 75) {
                        int leftFuel = currentFuel + fuelToRefill - 75;
                        fuelToRefill = fuelToRefill - leftFuel;
                        carsMap.get(car).set(1, max);
                    } else {
                        carsMap.get(car).set(1, currentFuel + fuelToRefill);
                    }
                    System.out.printf("%s refueled with %d liters\n", car, fuelToRefill);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(comArr[2]);
                    carsMap.get(car).set(0, carsMap.get(car).get(0) - kilometers);
                    if (carsMap.get(car).get(0) <= 10000) {
                        carsMap.get(car).set(0, 10000);
                    }else {
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        carsMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(entry -> {
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
                });
    }
}
