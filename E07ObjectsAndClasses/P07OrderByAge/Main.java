package E07ObjectsAndClasses.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<PersonInfo> listOfPersons = new ArrayList<>();

        while (!command.equals("End")) {
            String[] input = command.split(" ");
            String name = input[0];
            if(input.length>1) {
                String ID = input[1];
                int age = Integer.parseInt(input[2]);
                PersonInfo currentPerson = new PersonInfo(name, ID, age);
                listOfPersons.add(currentPerson);
            }
            command = scanner.nextLine();
        }
        listOfPersons.sort(Comparator.comparing(PersonInfo::getAge));
        for(PersonInfo person : listOfPersons){
            System.out.println(person);
        }
    }
}
