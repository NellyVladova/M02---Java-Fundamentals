package E05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> listOfGuests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String name = commandList.get(0);
            String secondCom = commandList.get(2);

            if (secondCom.equals("going!")) {
                if (listOfGuests.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    listOfGuests.add(name);
                }
            } else if (secondCom.equals("not")) {
                if (listOfGuests.contains(name)) {
                    listOfGuests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for (String element : listOfGuests) {
            System.out.println(element);
        }
    }
}
