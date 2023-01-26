import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                // Проверяваме Start Index
                if (startIndex < 0) {
                    startIndex = 0;
                }
                // Проверяваме за валиден  последен индекс
                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                boolean isValidIndex = startIndex <= input.size() - 1 && endIndex >= 0
                        && startIndex < endIndex;

                if (isValidIndex) {
                    // Имаме { "Ivo","Johny", "Tony", "Bony", "Mony"}
                    // Сливаме { 1  3 } - от 1 индекс до 3 индекс включително;
                    String resultOfMerge = "";

                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentInput = input.get(index);
                        resultOfMerge += currentInput;
                        // Получаваме -> "JohnyTonyBony"
                        // И премахваме
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        input.remove(startIndex);
                    }
                    // Остава { Ivo, Many }
                    input.add(startIndex, resultOfMerge);
                    // //{"Ivo", "JohnyTonyBony", "Mony"}
                }
                } else if (command.contains("divide")) {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int partitions = Integer.parseInt(command.split(" ")[2]); //На колко части разделяме
                    //{abcdef, ghi, jkl}
                    String elementsForDivide = input.get(index); // abcdef - 0 index
                    input.remove(index);
                    // {ghi, jkl}

                    int partSize = elementsForDivide.length() / partitions; // 2 елемента във всяка част

                    int firstIndex = 0;
                    for (int part = 1; part < partitions; part++) {
                        input.add(index, elementsForDivide.substring(firstIndex, firstIndex + partSize));
                        // {ab,cd,ghi, jkl}
                        index++; // 2
                        firstIndex += partSize;// 4

                    }
                    // добавяме всички останали символи към последната част
                    input.add(index, elementsForDivide.substring(firstIndex));
                    // Ако не достъпим крайния индекс - Взима последния индекс

                }

                command = scanner.nextLine();
            }
            System.out.println(String.join(" ", input));

        }
    }
