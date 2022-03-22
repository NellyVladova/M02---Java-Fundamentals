package L06ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String currentCommand = commandList.get(0);

            switch (currentCommand) {
                case "swap":
                    int index1 = Integer.parseInt(commandList.get(1));
                    int index2 = Integer.parseInt(commandList.get(2));
                    int firstIndexValue = numberList.get(index1);

                    numberList.set(index1, numberList.get(index2));
                    numberList.set(index2, firstIndexValue);
                    break;
                case "multiply":
                    int indexOne = Integer.parseInt(commandList.get(1));
                    int indexTwo = Integer.parseInt(commandList.get(2));

                    int result = numberList.get(indexOne) * numberList.get(indexTwo);
                    numberList.set(indexOne, result);
                    break;
                case "decrease":
                    for (int i = 0; i < numberList.size(); i++) {
                        numberList.set(i, numberList.get(i) - 1);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        String finalString = numberList.toString();
        System.out.println(String.join(", ", finalString).replaceAll("[\\[\\]]", ""));

    }
}
