package E08MapsLambdaAndStreamAPI;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> courseMap = new LinkedHashMap<>();

        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];

            if(!courseMap.containsKey(courseName)){
                courseMap.put(courseName, new ArrayList<>());
            }
            courseMap.get(courseName).add(studentName);

            command = scanner.nextLine();
        }
        courseMap.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry ->{
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
