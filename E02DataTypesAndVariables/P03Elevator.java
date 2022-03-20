package E02DataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = peopleNumber/capacity;
        if (peopleNumber % capacity != 0) {
            courses+=1;
        }
        System.out.println(courses);
    }
}
