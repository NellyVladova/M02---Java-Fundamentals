package E08MapsLambdaAndStreamAPI;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!command.equals("End")) {
            String companyName = command.split(" -> ")[0];
            String employeeId = command.split(" -> ")[1];

            if (companyMap.containsKey(companyName)) {
                List<String> employees = companyMap.get(companyName);
                if (!employees.contains(employeeId)) {
                    employees.add(employeeId);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                companyMap.put(companyName, employees);
            }

            command = scanner.nextLine();
        }
        companyMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
