package E10RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participant = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        Map<String, Integer> participantInfo = new LinkedHashMap<>();
        participant.forEach(racer -> participantInfo.put(racer, 0));

        Pattern patternName = Pattern.compile("[A-Za-z]+");
        Pattern patternDistance = Pattern.compile("[0-9]");
        Matcher matcherName = null;
        Matcher matcherDistance = null;

        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                name.append(matcherName.group());
            }
            matcherDistance = patternDistance.matcher(input);
            int distance = 0;
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String nameOfTheParticipant = name.toString();
            if (participantInfo.containsKey(nameOfTheParticipant)) {
                int currDistance = participantInfo.get(nameOfTheParticipant);
                participantInfo.put(nameOfTheParticipant, currDistance + distance);
            }

            input = scanner.nextLine();
        }

        List<String> firstThree = participantInfo.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));

    }
}
