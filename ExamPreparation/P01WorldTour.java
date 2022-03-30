package ExamPreparation;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] actionsArray = command.split(":");
            String firstCommand = actionsArray[0];
            switch (firstCommand) {
                case "Add Stop":
                    int index = Integer.parseInt(actionsArray[1]);
                    String toAdd = actionsArray[2];
                    if (indexIsValid(stops, index)) {
                        String firstSubstring = stops.substring(0, index);
                        String secondSubstring = stops.substring(index);
                        stops = firstSubstring + toAdd + secondSubstring;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(actionsArray[1]);
                    int endIndex = Integer.parseInt(actionsArray[2]);
                    if (indexIsValid(stops, startIndex)) {
                        if (indexIsValid(stops, endIndex)) {
                            String firstHalf = stops.substring(0, startIndex);
                            String secondHalf = stops.substring(endIndex + 1);
                            stops = firstHalf + secondHalf;
                        }
                    }
                    break;
                case "Switch":
                    String oldStr = actionsArray[1];
                    String newStr = actionsArray[2];
                    if (stops.contains(oldStr)) {
                        stops = stops.replace(oldStr, newStr);
                    }
                    break;
            }
            System.out.println(stops);
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    public static boolean indexIsValid(String str, int index) {
        return index >= 0 && index < str.length();
    }
}
