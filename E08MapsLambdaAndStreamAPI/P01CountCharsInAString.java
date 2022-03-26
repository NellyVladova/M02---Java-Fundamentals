package E08MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> letterCounts = new LinkedHashMap<>();
        for(char symbol : input.toCharArray()){
            if(symbol == ' '){
                continue;
            }
            if(!letterCounts.containsKey(symbol)){
                letterCounts.put(symbol, 1);
            }else {
                letterCounts.put(symbol, letterCounts.get(symbol) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : letterCounts.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
