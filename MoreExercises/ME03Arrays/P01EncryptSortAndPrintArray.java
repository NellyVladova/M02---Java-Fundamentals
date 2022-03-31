package MoreExercises.ME03Arrays;

import java.util.*;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> totalResults = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currName = scanner.nextLine();
            // a, e, i, o, u -> *length
            // others -> /length
            int vowelSum = 0;
            int consonantSum = 0;
            int totalSum = 0;
            for (int j = 0; j < currName.length(); j++) {
                char currLetter = currName.charAt(j);

                if (currLetter == 65 || currLetter == 69 || currLetter == 73 || currLetter == 79 ||
                        currLetter == 85 || currLetter == 97 || currLetter == 101
                        || currLetter == 105 || currLetter == 111 || currLetter == 117) {
                    vowelSum += (currLetter * currName.length());
                } else {
                    consonantSum += (currLetter / currName.length());
                }
            }
            totalSum = vowelSum + consonantSum;
            totalResults.add(totalSum);
        }
        Collections.sort(totalResults);
        for (Integer number : totalResults) {
            System.out.println(number);
        }
    }
}
