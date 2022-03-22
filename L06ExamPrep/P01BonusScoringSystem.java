package L06ExamPrep;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double totalBonus = 0;
        double maxBonus = Double.MIN_VALUE;
        int lectures = 0;

        for (int i = 0; i < countStudents; i++) {
            int attendancesOfEachStudent = Integer.parseInt(scanner.nextLine());

            totalBonus = (attendancesOfEachStudent * 1.0 / countLectures) * (5 + initialBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                lectures = attendancesOfEachStudent;
            }
        }
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Max Bonus: " + df.format(maxBonus) + ".");
        System.out.println("The student has attended " + lectures + " lectures.");
    }
}
