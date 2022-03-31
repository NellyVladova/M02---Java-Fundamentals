package MoreExercises.ME04Methods;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String number = scanner.nextLine();
        String finalResult = dataTypeFinder(input, number);
        if(finalResult.contains(".")){
            double doubleNum = Double.parseDouble(finalResult);
            System.out.printf("%.2f\n", doubleNum);
        }else {
            System.out.println(finalResult);
        }
    }
    public static String dataTypeFinder(String dataType, String number){
        String result = null;
        if(dataType.equals("int")){
            result = String.valueOf(Integer.parseInt(number) * 2);
        }else if(dataType.equals("real")){
            double num = Double.parseDouble(number) * 1.5;
            result = String.valueOf(num);
        }else if(dataType.equals("string")){
            result = "$" + number + "$";
        }
        return result;
    }

}
