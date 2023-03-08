
import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> examResults = new LinkedHashMap<>();
        Map<String, Integer> languagePoints = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {

            String[] command = input.split("-");
            String userName = command[0];
            String language = command[1];

            if (language.equals("banned")) {
                examResults.remove(userName);
                break;
            }
            if (!examResults.containsKey(userName)) {
                int points = Integer.parseInt(command[2]);
                examResults.put(userName, new ArrayList<>());
                examResults.get(userName).add(String.valueOf(points));
            }
            if (!languagePoints.containsKey(language)) {
                languagePoints.put(language, 1);
            } else {
                int currentCount = languagePoints.get(language);
                languagePoints.put(language, currentCount + 1);

            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        examResults.forEach((key, value) -> System.out.printf("%s | %s%n", key, value.toString().
                replaceAll("[\\[\\],]", "")));
        {
            System.out.println("Submissions:");
            languagePoints.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
        }
    }
}
