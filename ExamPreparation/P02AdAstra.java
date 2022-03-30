package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([#]|[|])(?<item>[A-Za-z ]+)(\\1)(?<date>\\d{2}\\/\\d{2}\\/\\d{2})(\\1)(?<calories>\\d{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> foodInfo = new ArrayList<>();
        int caloriesSum = 0;

        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            caloriesSum += calories;
            String foodName = matcher.group("item");
            String date = matcher.group("date");
            String caloriesOfFood = matcher.group("calories");

            foodInfo.add(String.format("Item: %s, Best before: %s, Nutrition: %s", foodName, date, caloriesOfFood));
        }
        int days = caloriesSum / 2000;
        System.out.println("You have food to last you for: " + days + " days!");
        for (String item : foodInfo) {
            System.out.println(item);
        }
    }
}
