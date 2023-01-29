import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    // Създаваме си клас за един Студент
    static class Student {
        // Правим цялостно обяснение какво искаме да съхраним
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        // Създаваме си конструктор
        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        // Създаваме си Гетърите ( get....)
        public String getTown() {
            return this.town;

        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Създаваме си лист, за да запазим стойностите на студентите
        // Взимаме класът който създадохме и неговото име е листа List<Student>...
        List<Student> studentList = new ArrayList<>();

        // Четем нещо от конзолата
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")) {
            // Разделяме си нашият стринг  чрез String[] и ги разделяме с празно място
            String[] arrStudentDate = inputLine.split("\\s+");
            // Изкаравме в една оделна променлива всеки един елемент и го запазваме
            String firstName = arrStudentDate[0];
            String lastName = arrStudentDate[1];
            int age = Integer.parseInt(arrStudentDate[2]);
            String town = arrStudentDate[3];

            // Създаваме нов обект от class Student и той ще си има всичко което създадохме
            // (
            Student currentStudent = new Student(firstName, lastName, age, town);
            // Добаваме към studentList
            studentList.add(currentStudent);


            inputLine = scanner.nextLine();
        }
        // Дай ми от този град - информацията;
        String homeTown = scanner.nextLine();
        // Искам за всеки студен да ми провери от studentList
        for (Student item : studentList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n",
             item.getFirstName(),item.getLastName(),item.age,item.getTown());
            }
        }
    }
}
