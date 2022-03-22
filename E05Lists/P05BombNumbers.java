package E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] specialBombNumber = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(specialBombNumber[0]);
        int numPower = Integer.parseInt(specialBombNumber[1]);

        while (numberList.contains(bombNum)) {
            int index = numberList.indexOf(bombNum);
            int left = Math.max(0, index-numPower);
            int right = Math.min(index+numPower, numberList.size()-1);
            for (int i = right; i >=left ; i--) {
                numberList.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        System.out.println(sum);
    }
}
