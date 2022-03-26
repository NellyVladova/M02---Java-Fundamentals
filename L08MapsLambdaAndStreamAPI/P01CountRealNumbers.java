package L08MapsLambdaAndStreamAPI;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> count = new TreeMap<>();
        for(double number: listOfNumbers){
            if(!count.containsKey(number)){
                count.put(number, 0);
            }
            count.put(number, count.get(number) + 1);
        }
        for(Map.Entry<Double, Integer> entry : count.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d\n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
