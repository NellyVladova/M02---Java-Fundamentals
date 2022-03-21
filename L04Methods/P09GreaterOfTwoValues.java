package L04Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();

        switch (valueType){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne, numTwo));
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum){
        if(firstNum>secondNum){
            return firstNum;
        }else {
            return secondNum;
        }
    }

    public static char getMax(char first, char second){
        if (first > second) {
            return first;
        }else {
            return second;
        }
    }

    public static String getMax(String first, String second){
        if(first.compareTo(second)>=0){
            return first;
        }else {
            return second;
        }
    }
}
