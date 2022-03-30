package ExamPreparation;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Generate")){
            String[] comArr = command.split(">>>");
            String firstCom = comArr[0];
            switch (firstCom){
                case "Contains":
                    String substring = comArr[1];
                    if(activationKey.contains(substring)){
                        System.out.printf("%s contains %s\n", activationKey, substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = comArr[1];
                    int startIndex = Integer.parseInt(comArr[2]);
                    int endIndex = Integer.parseInt(comArr[3]);
                    String toReplace = activationKey.substring(startIndex, endIndex);

                    if(upperOrLower.equals("Upper")){
                        activationKey = activationKey.replace(toReplace, toReplace.toUpperCase());
                    } else if (upperOrLower.equals("Lower")) {
                        activationKey = activationKey.replace(toReplace, toReplace.toLowerCase());
                    }
                    System.out.println(activationKey);

                    break;
                case "Slice":
                    int firstIndex = Integer.parseInt(comArr[1]);
                    int lastIndex = Integer.parseInt(comArr[2]);
                    String toRemove = activationKey.substring(firstIndex, lastIndex);

                    activationKey = activationKey.replace(toRemove, "");
                    System.out.println(activationKey);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);

    }
}
