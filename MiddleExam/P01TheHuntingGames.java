package MiddleExam;

import java.util.Scanner;

public class P01TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int playersCount = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());

        double allWater = playersCount * days * waterPerDayForOnePerson;
        double allFood = playersCount * days * foodPerDayForOnePerson;
        boolean runOutOfEnergy = false;

        for (int i = 1; i <= days; i++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());
            groupEnergy -= lostEnergy;
            if (groupEnergy <= 0) {
                runOutOfEnergy = true;
                break;
            }
            if (i % 2 == 0) {
                groupEnergy += (groupEnergy * 0.05);
                allWater -= (allWater * 0.30);
            }
            if (i % 3 == 0) {
                allFood -= (allFood / playersCount);
                groupEnergy *= 1.1;
            }
        }
        if (runOutOfEnergy) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", allFood, allWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
        }
    }
}
