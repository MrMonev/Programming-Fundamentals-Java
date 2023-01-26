import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textOfLessonsAndExercise = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {

            String[] separateCommand = input.split(":");
            String command = separateCommand[0];
            String lessonTitle = separateCommand[1];

            switch (command) {
                case "Add":
                    if (!textOfLessonsAndExercise.contains(lessonTitle)) {
                        textOfLessonsAndExercise.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(separateCommand[2]);
                    if (!textOfLessonsAndExercise.contains(lessonTitle)) {
                        textOfLessonsAndExercise.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (textOfLessonsAndExercise.contains(lessonTitle)) {
                        textOfLessonsAndExercise.remove(lessonTitle);
                    }
                    int indexLesson = textOfLessonsAndExercise.indexOf(lessonTitle);
                    if (textOfLessonsAndExercise.get(indexLesson + 1).equals(lessonTitle+"-Exercise")) {
                        textOfLessonsAndExercise.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lessonTittle2 = input.split(":")[2];
                    if (textOfLessonsAndExercise.contains(lessonTitle) && textOfLessonsAndExercise.contains(lessonTittle2)) {
                        int lesson1 = textOfLessonsAndExercise.indexOf(lessonTitle);
                        int lesson2 = textOfLessonsAndExercise.indexOf(lessonTittle2);
                        textOfLessonsAndExercise.set(lesson1, lessonTittle2);
                        textOfLessonsAndExercise.set(lesson2,lessonTitle);

                        String one = lessonTitle + "-Exercise";
                        String two = lessonTittle2 + "-Exercise";
                        if (textOfLessonsAndExercise.contains(one)) {
                            textOfLessonsAndExercise.remove(textOfLessonsAndExercise.indexOf(one));
                            textOfLessonsAndExercise.add(textOfLessonsAndExercise.indexOf(lessonTitle + 1),one);

                        }
                        if (textOfLessonsAndExercise.contains(two)) {
                            textOfLessonsAndExercise.remove(textOfLessonsAndExercise.indexOf(two));
                            textOfLessonsAndExercise.add(textOfLessonsAndExercise.indexOf(lessonTittle2) + 1, two);

                        }
                    }

                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTittle = textOfLessonsAndExercise.indexOf(lessonTitle);
                    if (textOfLessonsAndExercise.contains(lessonTitle)) {
                        if (indexLessonTittle == textOfLessonsAndExercise.size() - 1) {
                            textOfLessonsAndExercise.add(indexLessonTittle + 1, exercise);
                        } else if (!textOfLessonsAndExercise.get(indexLessonTittle + 1).equals(exercise)) {
                            textOfLessonsAndExercise.add(indexLessonTittle + 1, exercise);
                        }
                    } else {
                        textOfLessonsAndExercise.add(lessonTitle);
                        textOfLessonsAndExercise.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(textOfLessonsAndExercise);

    }
    public static void printList(List<String> elements) {
        int count = 1;
        for (String element: elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
