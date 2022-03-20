package E02DataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedCount = 0;
        int firstPower = power;
        while (power >= distance) {
            power-=distance;
            pokedCount++;
            if (power == firstPower * 0.5 && exhaustionFactor != 0) {
                power/=exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(pokedCount);
    }
}
