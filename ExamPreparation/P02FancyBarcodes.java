package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+([A-Z][A-Za-z0-9]{4,})([A-Z])@#+");
        Matcher matcher = null;

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);

            if(matcher.find()){
                StringBuilder stringBuilder = new StringBuilder();
                    for (int j = 0; j < input.length(); j++) {
                        char symbol = input.charAt(j);
                        if (Character.isDigit(symbol)) {
                        stringBuilder.append(symbol);
                    }
                }
                if(stringBuilder.length()==0){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + stringBuilder);
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
