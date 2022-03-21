package E03Arrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String elementInSecond:secondArray) {
            for (String elementInFirst:firstArray) {
                if(elementInSecond.equals(elementInFirst)){
                    System.out.print(elementInSecond + " ");
                }
            }
        }
    }
}
