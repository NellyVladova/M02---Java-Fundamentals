package ExamPreparation;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> favPianoPieces = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandPieces = scanner.nextLine().split("\\|");
            String piece = commandPieces[0];
            String composer = commandPieces[1];
            String key = commandPieces[2];
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            favPianoPieces.put(piece, pieceInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] comArr = command.split("\\|");
            String firstCom = comArr[0];
            switch (firstCom){
                case "Add":
                    String pieceToAdd = comArr[1];
                    String composerName = comArr[2];
                    String key = comArr[3];
                    if(favPianoPieces.containsKey(pieceToAdd)){
                        System.out.printf("%s is already in the collection!\n", pieceToAdd);
                    }else {
                        List<String> toAddInTheMap = new ArrayList<>();
                        toAddInTheMap.add(composerName);
                        toAddInTheMap.add(key);
                        favPianoPieces.put(pieceToAdd, toAddInTheMap);
                        System.out.printf("%s by %s in %s added to the collection!\n", pieceToAdd, composerName, key);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = comArr[1];
                    if(favPianoPieces.containsKey(pieceToRemove)){
                        favPianoPieces.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!\n", pieceToRemove);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceToChange = comArr[1];
                    String newKey = comArr[2];
                    if (favPianoPieces.containsKey(pieceToChange)) {
                        List<String> currentPiece = favPianoPieces.get(pieceToChange);
                        currentPiece.remove(1);
                        currentPiece.add(newKey);
                        favPianoPieces.put(pieceToChange, currentPiece);
                        System.out.printf("Changed the key of %s to %s!\n", pieceToChange, newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", pieceToChange);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        favPianoPieces.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
