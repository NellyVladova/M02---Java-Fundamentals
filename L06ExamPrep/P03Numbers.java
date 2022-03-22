package L06ExamPrep;

import java.util.*;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        List<Integer> topNumbers = new ArrayList<>();
        double averageNum = sum * 1.0 / numberArray.length;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > averageNum) {
                topNumbers.add(numberArray[i]);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);
        if (topNumbers.size() > 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        }else if(topNumbers.isEmpty()){
            System.out.println("No");
        } else {
            System.out.print(topNumbers.toString().replaceAll("[\\[\\],]", ""));

        }
    }
}
