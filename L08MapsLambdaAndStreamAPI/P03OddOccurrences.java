package L08MapsLambdaAndStreamAPI;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> countWords = new LinkedHashMap<>();

        for (String word : input) {
            String wordToLowerCase = word.toLowerCase();
            if (countWords.containsKey(wordToLowerCase)) {
                countWords.put(wordToLowerCase, countWords.get(wordToLowerCase) + 1);
            } else {
                countWords.put(wordToLowerCase, 1);
            }
        }
        List<String> oddCountWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCountWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddCountWords));
    }
}
