package L06ExamPrep;

import java.util.Scanner;

public class P04SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int hourCounter = 0;
        while (studentCount>0){
            hourCounter++;
            if(hourCounter%4==0){
                continue;
            }else {
                studentCount -= studentsPerHour;
            }
        }
        System.out.println("Time needed: " + hourCounter + "h.");
    }
}
