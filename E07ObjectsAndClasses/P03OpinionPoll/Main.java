package E07ObjectsAndClasses.P03OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split(" ");
            String name = information[0];
            int age = Integer.parseInt(information[1]);

            Person currentPerson = new Person(name, age);

            if(age > 30){
                personList.add(currentPerson);
            }
        }
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person : personList){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
