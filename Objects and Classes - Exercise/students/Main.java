package students;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int studentCount = 1; studentCount <= countStudents; studentCount++) {
            String date = scanner.nextLine();
            //"First name: { second name }: { grade }"
            String[] dateParts = date.split(" ");
            String firstName = dateParts[0];
            String lastName = dateParts[1];
            double grade = Double.parseDouble(dateParts[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }
        // списък със студенти
        // 1. сортира по оценка
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        //2. отпечатвам всеки един студент
        for (Student student:studentList) {
             //"First name: { second name }: { grade }"
            System.out.println(student);
        }
    }
}
