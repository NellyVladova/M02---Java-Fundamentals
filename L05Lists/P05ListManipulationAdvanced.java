package L05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sumOfAll = 0;
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            String secondCommand = commandLine.get(1);
            boolean containsNumberX = false;
            boolean noSuchNum = false;


            switch (command) {
                case "Contains":
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i).equals(Integer.parseInt(commandLine.get(1)))) {
                            containsNumberX = true;
                            break;
                        }else {
                            noSuchNum = true;
                        }
                    }
                    break;
                case "Print":
                    if (secondCommand.equals("even")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 == 0) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (secondCommand.equals("odd")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 != 0) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (secondCommand.equals("sum")) {
                        for (int i = 0; i < numList.size(); i++) {
                            sumOfAll += numList.get(i);
                        }
                        System.out.println(sumOfAll);
                    }
                    break;
                case "Filter":
                    String thirdCommand = commandLine.get(2);
                    if (secondCommand.equals("<")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) < Integer.parseInt(thirdCommand)) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (secondCommand.equals(">")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) > Integer.parseInt(thirdCommand)) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (secondCommand.equals("<=")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) <= Integer.parseInt(thirdCommand)) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (secondCommand.equals(">=")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) >= Integer.parseInt(thirdCommand)) {
                                System.out.print(numList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            if (containsNumberX) {
                System.out.println("Yes");
            }
            if (noSuchNum && !containsNumberX) {
                System.out.println("No such number");
            }

            input = scanner.nextLine();
        }
    }
}
