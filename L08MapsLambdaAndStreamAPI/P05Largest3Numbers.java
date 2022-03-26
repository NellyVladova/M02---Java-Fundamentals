package L08MapsLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((num1, num2) -> num2.compareTo(num1)).collect(Collectors.toList());
        if(inputList.size()>=3){
            for (int i = 0; i < 3; i++) {
                System.out.print(inputList.get(i) + " ");
            }
        }else {
            for (int i = 0; i < inputList.size(); i++) {
                System.out.print(inputList.get(i) + " ");
            }
        }

    }
}
