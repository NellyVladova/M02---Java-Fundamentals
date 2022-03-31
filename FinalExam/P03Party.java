package FinalExam;

import java.util.*;

public class P03Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> guestsCollection = new TreeMap<>();
        int counterDislike = 0;
        while (!input.equals("Stop")) {
            String[] commandArr = input.split("-");
            String firstCom = commandArr[0];
            String guestName = commandArr[1];
            String meal = commandArr[2];
            //List<String> info = new ArrayList<>();


            switch (firstCom) {
                case "Like":
                    if (guestsCollection.containsKey(guestName)) {
                        if (!guestsCollection.containsValue(meal)) {
                            guestsCollection.get(guestName).add(meal);

                        }
                    } else if (!guestsCollection.containsKey(guestName)) {

                        guestsCollection.put(guestName, new ArrayList<>());
                        guestsCollection.get(guestName).add(meal);
                    }
                    break;
                case "Dislike":

                    if (guestsCollection.containsKey(guestName)) {
                        if (!guestsCollection.get(guestName).contains(meal)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guestName, meal);
                        } else {

                            counterDislike++;
                            int index = guestsCollection.get(guestName).indexOf(meal);
                            guestsCollection.get(guestName).set(index, "");
                            guestsCollection.entrySet().stream().forEach(entry->{
                                entry.getValue().remove("");
                            });
                            System.out.printf("%s doesn't like the %s.\n", guestName, meal);
                        }

                    } else {
                        System.out.printf("%s is not at the party.\n", guestName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        guestsCollection.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(entry -> {
                    System.out.printf("%s: ",entry.getKey());
                  //  entry.getValue().remove("");
                    System.out.print(String.join(", ",entry.getValue()));
                    System.out.println();
                });

        System.out.printf("Unliked meals: %d\n",counterDislike);
    }
}
