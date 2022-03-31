package FinalExam;

import java.util.Scanner;

public class P01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        String com  = scanner.nextLine();
        while (!com.equals("Complete")) {
            String[] comArr = com.split(" ");
            String firstCom = comArr[0];
            switch (firstCom){
                case "Make":
                    String secCom = comArr[1];
                    int indexToMakeUpOrLow = Integer.parseInt(comArr[2]);
                    String firstSubstring = pass.substring(0, indexToMakeUpOrLow);
                    String secondSubstring = pass.substring(indexToMakeUpOrLow + 1);
                    String letter = null;
                    if(secCom.equals("Upper")){
                        letter = pass.substring(indexToMakeUpOrLow, indexToMakeUpOrLow + 1).toUpperCase();
                    }else if(secCom.equals("Lower")){
                        letter = pass.substring(indexToMakeUpOrLow, indexToMakeUpOrLow + 1).toLowerCase();
                    }
                    pass = firstSubstring + letter + secondSubstring;
                    System.out.println(pass);
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(comArr[1]);
                    String symbol = comArr[2];
                    String firstSub = pass.substring(0, indexToInsert);
                    String secondSub = pass.substring(indexToInsert);
                    pass = firstSub + symbol + secondSub;
                    System.out.println(pass);
                    break;
                case "Replace":
                    char[] charToReplace = comArr[1].toCharArray();
                    int valueChar = charToReplace[0];
                    int value = Integer.parseInt(comArr[2]);
                    valueChar+=value;
                    char newChar = (char) valueChar;
                    if(pass.contains(comArr[1])){
                        pass = pass.replace(charToReplace[0], newChar);
                        System.out.println(pass);
                    }
                    break;
                case "Validation":
                    if(pass.length()<8){
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    char[] validPass = pass.toCharArray();
                    int countOfDigit = 0;
                    int countOfUpper = 0;
                    int countOfLower = 0;
                    for (int i = 0; i < pass.length(); i++) {
                        if(!(Character.isLetterOrDigit(validPass[i]) || validPass[i] == '_')){
                            System.out.println("Password must consist only of letters, digits and _!");
                        }
                        if(validPass[i]>=65 && validPass[i]<=90){
                            countOfUpper++;
                        }
                        if(validPass[i]>=97 && validPass[i]<=122){
                            countOfLower++;
                        }
                        if(Character.isDigit(validPass[i])){
                            countOfDigit++;
                        }
                    }
                    if(countOfUpper==0){
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if (countOfLower == 0) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    if (countOfDigit==0){
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;
            }
            com = scanner.nextLine();
        }
    }
}
