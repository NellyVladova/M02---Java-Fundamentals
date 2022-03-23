package E07ObjectsAndClasses.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command1 = scanner.nextLine();
        List<Vehicle> listOfVehicles = new ArrayList<>();
        double avgHorsePowerForTrucks = 0;
        double avgHorsePowerForCars = 0;
        int trucksCount = 0;
        int carsCount = 0;

        while (!command1.equals("End")) {
            String[] currentVehicle = command1.split(" ");
            String type = currentVehicle[0];
            if(currentVehicle.length>1) {
                String model = currentVehicle[1];
                String color = currentVehicle[2];
                String horsePower = currentVehicle[3];

                Vehicle currVehicle = new Vehicle(type, model, color, horsePower);
                listOfVehicles.add(currVehicle);
                command1 = scanner.nextLine();
            }
        }
        String command2 = scanner.nextLine();
        while (!command2.equals("Close the Catalogue")) {
            for (Vehicle vehicle : listOfVehicles) {
                if (command2.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
            command2 = scanner.nextLine();
        }

        for (Vehicle vehicle : listOfVehicles) {
            if (vehicle.getType().equals("car")) {
                carsCount++;
                avgHorsePowerForCars += Double.parseDouble(vehicle.getHorsePower());
            } else if (vehicle.getType().equals("truck")) {
                trucksCount++;
                avgHorsePowerForTrucks += Double.parseDouble(vehicle.getHorsePower());
            }
        }
        avgHorsePowerForTrucks/=trucksCount;
        avgHorsePowerForCars/=carsCount;

        if(avgHorsePowerForCars>0){
            System.out.printf("Cars have average horsepower of: %.2f.\n", avgHorsePowerForCars);
        }else {
            System.out.print("Cars have average horsepower of: 0.00.\n");
        }
        if(avgHorsePowerForTrucks>0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", avgHorsePowerForTrucks);
        }else {
            System.out.print("Trucks have average horsepower of: 0.00.");
        }
    }
}
