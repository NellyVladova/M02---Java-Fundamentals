package E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (firstPlayerCards.size()>0 && secondPlayerCards.size()>0){
            int currentCardPlayer1 = firstPlayerCards.get(0);
            int currentCardPlayer2 = secondPlayerCards.get(0);

            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);
            if(currentCardPlayer1>currentCardPlayer2){
                firstPlayerCards.add(currentCardPlayer1);
                firstPlayerCards.add(currentCardPlayer2);
            }else if(currentCardPlayer1<currentCardPlayer2){
                secondPlayerCards.add(currentCardPlayer2);
                secondPlayerCards.add(currentCardPlayer1);
            }
        }
        int winnerSum = 0;

        if(firstPlayerCards.size()==0){
            for (int i = 0; i < secondPlayerCards.size(); i++) {
                winnerSum+=secondPlayerCards.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", winnerSum);
        }else if(secondPlayerCards.size()==0){
            for (int i = 0; i < firstPlayerCards.size(); i++) {
                winnerSum+=firstPlayerCards.get(i);
            }
            System.out.printf("First player wins! Sum: %d", winnerSum);
        }
    }
}
