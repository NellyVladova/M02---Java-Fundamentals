package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        Pattern pattern = Pattern.compile("(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(places);
        List<String> placesList = new ArrayList<>();
        int travelSum = 0;
        while (matcher.find()){
            int currLength = matcher.group("destination").length();
            travelSum+=currLength;
            String currDestination = matcher.group("destination");
            placesList.add(currDestination);
        }
        System.out.println("Destinations: " + String.join(", ", placesList));
        System.out.println("Travel Points: " + travelSum);
    }
}
