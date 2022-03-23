package L07ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
    public static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] input = command.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String city = input[3];
            if (exists(studentsList, firstName, lastName)) {
                Student student = getStudent(studentsList, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(city);
            }else {
                Student currentStudent = new Student(firstName, lastName, age, city);
                studentsList.add(currentStudent);
            }
            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student currentStudent : studentsList) {
            if (cityName.equals(currentStudent.getHometown())) {
                System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName() + " is " + currentStudent.getAge() + " years old");
            }
        }

    }

    private static boolean exists(List<Student> studentsList, String firstName, String lastName) {
        for (Student student : studentsList) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if(firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())){
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}
