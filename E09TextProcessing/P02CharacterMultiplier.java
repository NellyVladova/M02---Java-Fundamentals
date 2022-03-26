package E09TextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        System.out.println(sum(str1, str2));

    }

    public static int sum(String s1, String s2){
        int sum = 0;

        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            if(i < s1.length() && i < s2.length()){
                sum += s1.charAt(i) * s2.charAt(i);
            }else if(i < s1.length()){
                sum += s1.charAt(i);
            }else{
                sum += s2.charAt(i);
            }
        }
        return sum;
    }
}
