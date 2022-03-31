package MiddleExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int countOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOfCommands; i++) {
            List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String firstCom = commandList.get(0);
            switch (firstCom) {
                case "Include":
                    String coffeeToAdd = commandList.get(1);
                    coffeeList.add(coffeeToAdd);
                    break;
                case "Remove":
                    String coffeeToRemove = commandList.get(1);
                    int numberOfCoffees = Integer.parseInt(commandList.get(2));
                    if (numberOfCoffees < coffeeList.size()) {
                        if (coffeeToRemove.equals("first")) {
                            for (int j = 0; j < numberOfCoffees; j++) {
                                int index = 0;
                                coffeeList.remove(index);
                            }
                        } else if (coffeeToRemove.equals("last")) {
                            for (int j = 0; j < numberOfCoffees; j++) {
                                int index = coffeeList.size() - 1;
                                coffeeList.remove(index);
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(commandList.get(1));
                    int index2 = Integer.parseInt(commandList.get(2));
                    if (index1 < coffeeList.size() && index2 < coffeeList.size()) {
                        String firstValueOfIndex1 = coffeeList.get(index1);
                        coffeeList.set(index1, coffeeList.get(index2));
                        coffeeList.set(index2, firstValueOfIndex1);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }
        }
        System.out.println("Coffees:");
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.print(coffeeList.get(i) + " ");
        }
    }
}