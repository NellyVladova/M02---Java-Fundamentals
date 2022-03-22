package L06ExamPrep;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityInKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityInKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityInKg = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= 30; i++) {
            foodQuantityInKg -= 0.3;
            if (i % 2 == 0) {
                hayQuantityInKg -= foodQuantityInKg * 0.05;
            }
            if (i % 3 == 0) {
                double kg = (weight / 3);
                coverQuantityInKg -= kg;
            }
        }

        if (foodQuantityInKg >= 0 && hayQuantityInKg >= 0 && coverQuantityInKg >= 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantityInKg, hayQuantityInKg, coverQuantityInKg);
        }else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
