package E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" ")).map((Integer::parseInt)).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            List<String> listCommand = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstCommand = listCommand.get(0);

            if(firstCommand.equals("Add")){
                String secondCommand = listCommand.get(1);

                listOfWagons.add(listOfWagons.size(), Integer.parseInt(secondCommand));
            }else {
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if(listOfWagons.get(i)+Integer.parseInt(firstCommand)<=maxCapacity){
                        listOfWagons.set(i, (Integer.parseInt(firstCommand) + listOfWagons.get(i)));
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < listOfWagons.size(); i++) {
            System.out.print(listOfWagons.get(i) + " ");
        }
    }
}
