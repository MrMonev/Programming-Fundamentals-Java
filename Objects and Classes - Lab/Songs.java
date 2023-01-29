import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Songs {
    // Класа го създаваме за всяка една песен, Какво съдържа;
    static class Song {
        private String typeList;
        private String nameSong;
        private String timeOfSong;

        public Song(String typeList, String nameSong, String timeOfSong) {
            // Това е нашият конструктор - който го създаваме за да може
            // да запазим нашите промениливи какво да пазят;
            this.typeList = typeList;
            this.nameSong = nameSong;
            this.timeOfSong = timeOfSong;


        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getNameSong() {
            return this.typeList;
        }

        public String getTimeOfSong() {
            return this.timeOfSong;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                // Трябва да внимаваме когагто използваме item. кой тип задаваме!
                System.out.println(item.nameSong);
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.nameSong);
                }
            }
        }
    }
}
