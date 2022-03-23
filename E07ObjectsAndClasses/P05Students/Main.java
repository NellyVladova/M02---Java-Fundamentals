package E07ObjectsAndClasses.P05Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String currFirstName = input[0];
            String currLastName = input[1];
            double currGrade = Double.parseDouble(input[2]);
            Student currentStudent = new Student(currFirstName, currLastName, currGrade);
            studentList.add(currentStudent);
        }
        studentList.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(studentList);
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
