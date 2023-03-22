import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine(); // имена разделени с (, );
        List<String> racersNameList = Arrays.stream(names.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        // име на състезател -> дистанция
        racersNameList.forEach(racer -> racersDistance.put(racer, 0));

        // Regex:
        String lettersRegex = "[A-Za-z]";
        Pattern pattern = Pattern.compile(lettersRegex);
        String digitsRegex = "[0-9]";
        Pattern patternDigits = Pattern.compile(digitsRegex);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            // input - "G!32e%o7r#32g$235@!2e"

            // име на състезателя -> само буквите - G e o r g i
            StringBuilder nameBuilder = new StringBuilder();// Конструираме името на състезателя
            Matcher matcherLetter = pattern.matcher(input);// Всички букви -> ["G" "e" "o" "r" "g" "e"]
            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }
            // дистанция на състезателя -> сумата от цифрите
            int distance = 0; // Сумирам всички цифрви
            Matcher matcherDigit = patternDigits.matcher(input); // Всички цифри -> ["3" "2" "7" "3" "2" "2" "3" "5"]
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }
            //Проверка? Има ли таъкв състезател -> Добавя дистанцията към съответния състезател
            String racerName = nameBuilder.toString();// Името на състезателя
            if (racersNameList.contains(racerName)) {
                // име на състезател -> дистанция
            int currentDistance = racersDistance.get(racerName);
            racersDistance.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
         // {"Georgi, "Peter", "Bill", "Tom"}
        for (int index = 0; index < 3 ; index++) {
            if(index == 0) {
                System.out.println("1st place: " + racersNameList.get(index));
            } else if (index == 1) {
                System.out.println("2nd place: " + racersNameList.get(index));
            } else if (index == 2) {
                System.out.println("3rd place: " + racersNameList.get(index));
            }

        }
    }
}
