import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Стундет -> списък с оценки;

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine(); // Име на студента
            double grade = Double.parseDouble(scanner.nextLine());// Оценка на студента

            // 1. Студентът да не е записан
            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            // 2. Студентът да е записан

                studentsGrade.get(name).add(grade);
            }
            // Имаме, Име на студента -> списък с неговите оценки


            //записи: Име на студента (key) -> средна оценка(value)
            Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

            for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
                String studentName = entry.getKey();// име на студента
                List<Double> listGrades = entry.getValue();// Списък с оценки за всеки студент
                double averageGrade = getAverageGrade(listGrades);// средна оценка на студента
                // Студент -> списък с оценките -> ср.аритметична оценка
                if (averageGrade >= 4.50) {
                    averageGradeStudents.put(studentName, averageGrade);
                }
            }
            //отпечатваме: averageGradeStudents
            // entry: name(key) -> av.grade(value)
            averageGradeStudents.entrySet().forEach(entry -> System.out.printf
                            ("%s -> %.2f%n", entry.getKey(), entry.getValue()));
        }


    private static double getAverageGrade(List<Double> listGrades) {
        // {4.60, 3.50, 5.90, 4.70, 2.50}
        // Ср. аритметично = сбора от оценките /  брой на оценките
        double sumGrade = 0; // сбора на оценките
        for (double grade : listGrades) {
            sumGrade += grade;
        }
        return sumGrade / listGrades.size(); // сбора / техния брой оценки
    }
}
