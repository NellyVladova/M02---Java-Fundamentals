package E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstCom = commandList.get(0);
            String secondCom = commandList.get(1);
            switch (firstCom) {
                case "Add":
                    listOfNumbers.add(Integer.parseInt(secondCom));
                    break;
                case "Insert":
                    String thirdCom = commandList.get(2);
                    int index = Integer.parseInt(thirdCom);
                    int insertingNumber = Integer.parseInt(secondCom);
                    insert(listOfNumbers, index, insertingNumber);
                    break;
                case "Remove":
                    int indexForRemove = Integer.parseInt(secondCom);
                    remove(listOfNumbers, indexForRemove);
                    break;
                case "Shift":
                    int count = Integer.parseInt(commandList.get(2));
                    shiftLeftOrRight(listOfNumbers, secondCom, count);

                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer element : listOfNumbers) {
            System.out.print(element + " ");
        }
    }

    private static void insert(List<Integer> list, int index, int num) {
        if (index >= 0 && index <= list.size() - 1) {
            list.add(index, num);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void remove(List<Integer> list, int index) {
        if (index >= 0 && index <= list.size() - 1) {
            list.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void shiftLeftOrRight(List<Integer> list, String com, int counter) {
        if (com.equals("left")) {
            for (int i = 0; i < counter; i++) {
                int removed = list.get(0);
                list.remove(list.get(0));
                list.add(removed);
            }
        } else if (com.equals("right")) {
            for (int i = 0; i < counter; i++) {
                int removed = list.get(list.size() - 1);
                list.remove(list.get(list.size() - 1));
                list.add(0, removed);
            }
        }
    }
}
