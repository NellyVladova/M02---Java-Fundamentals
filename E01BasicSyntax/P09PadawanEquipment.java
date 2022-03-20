package E01BasicSyntax;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabres = sabresPrice * Math.ceil(studentsNumber * 0.10 + studentsNumber);
        double robes = robesPrice * studentsNumber;
        double belts = beltsPrice * (studentsNumber - studentsNumber / 6);
        double totalPrice = sabres + robes + belts;
        if (totalPrice <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - availableMoney);
        }
    }
}
