package E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstCommand = commandList.get(0);
            String secondCommand = commandList.get(1);
            switch (firstCommand) {
                case "Delete":
                    numberList.removeIf(e -> e == Integer.parseInt(secondCommand));
                    break;
                case "Insert":
                    String thirdCommand = commandList.get(2);
                    numberList.add(Integer.parseInt(thirdCommand), Integer.parseInt(secondCommand));
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }
    }
}
