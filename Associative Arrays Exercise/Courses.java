import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Трябва да съхраня информация за курсове
        // Всеки курс има име и регистрирани студенти
        // От конзолата ще получаваме { Име на курса } : { име на студента }
        // Докато не получим командата "end".

        //1. Трябва да проверя курса дали веще съществува, ако не трябва да го добавя.
        //2. Трябва да регистрирам User -> Course
        //3. Когато получа командата "end" -> принтираме:
        //   {Име на курса}: {+ counter}
        //   {-- Име на студента}


        Map<String, List<String>> informationForCourse = new LinkedHashMap<>();

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+:\\s+");

            String courseName = commandArr[0];
            String studentName = commandArr[1];

            informationForCourse.putIfAbsent(courseName, new ArrayList<>());
            informationForCourse.get(courseName).add(studentName);

            command = scanner.nextLine();
        }

    informationForCourse.entrySet().forEach
                (entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(student -> System.out.printf("-- %s%n", entry.getValue().
                            get(entry.getValue().indexOf(student))));
                });

    }
}
