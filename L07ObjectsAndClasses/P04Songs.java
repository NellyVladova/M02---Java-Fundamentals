package L07ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    public static class Song{
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songsNumber = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < songsNumber; i++) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song currentSong = new Song(type, name, time);

            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if(command.equals("all")){
            for (Song elements : songList){
                System.out.println(elements.getName());
            }
        }else {
            for (Song elements : songList){
                if(command.equals(elements.getTypeList())){
                    System.out.println(elements.getName());
                }
            }
        }
    }
}
