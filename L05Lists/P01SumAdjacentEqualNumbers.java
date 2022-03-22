package L05Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> num = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i).equals(num.get(i + 1))) {
                num.set(i, (num.get(i) + num.get(i + 1)));
                num.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementsByDelimiter(num, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String result = "";
        for (Double element : items) {
            result += (new DecimalFormat("0.#").format(element) + delimiter);
        }
        return result;
    }
}
