package E02DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxKegVolume = Double.MIN_VALUE;
        String maxKegModel = "";
        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxKegVolume) {
                maxKegVolume = volume;
                maxKegModel = model;
            }
        }
        System.out.println(maxKegModel);
    }
}
