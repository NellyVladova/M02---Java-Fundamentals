package E08MapsLambdaAndStreamAPI;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGradeMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(!studentsGradeMap.containsKey(studentName)){
                studentsGradeMap.put(studentName, new ArrayList<>());
            }
            studentsGradeMap.get(studentName).add(grade);
        }
        Map<String, Double> studentsAvgGradeMap = new LinkedHashMap<>();
        for(Map.Entry<String, List<Double>> currentStudent : studentsGradeMap.entrySet()){
            String studentName = currentStudent.getKey();
            List<Double> grade = currentStudent.getValue();
            double averageGrade = getAvgGrade(grade);
            if(averageGrade>=4.50){
                studentsAvgGradeMap.put(studentName, averageGrade);
            }
        }

        studentsAvgGradeMap.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    public static double getAvgGrade(List<Double> grades){
        double average = 0;
        for(double currentGrade : grades){
            average+=currentGrade;
        }
        average/=grades.size();

        return average;
    }
}
