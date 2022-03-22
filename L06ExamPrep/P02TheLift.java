package L06ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i) == 0 && peopleCount >= 4) {
                wagons.set(i, 4);
                peopleCount -= 4;
            } else if (wagons.get(i) <= 1 && peopleCount >= 3) {
                wagons.set(i, wagons.get(i) + 3);
                peopleCount -= 3;
            } else if (wagons.get(i) <= 2 && peopleCount >= 2) {
                wagons.set(i, wagons.get(i) + 2);
                peopleCount -= 2;
            } else if (wagons.get(i) <= 3 && peopleCount >= 1) {
                wagons.set(i, wagons.get(i) + 1);
                peopleCount -= 1;
            } else if (wagons.get(i) == 4 && peopleCount>=0) {
                continue;
            }
        }
        if (peopleCount == 0) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < wagons.size(); i++) {
                System.out.print(wagons.get(i) + " ");
            }
        } else if (peopleCount > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleCount);
            for (int i = 0; i < wagons.size(); i++) {
                System.out.print(wagons.get(i) + " ");
            }
        }
    }
}
