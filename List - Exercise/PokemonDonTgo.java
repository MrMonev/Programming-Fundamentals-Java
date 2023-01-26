import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDonTgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Списък с числа
        List<Integer> number = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0; // сума на премахнатите елементи
        // Повтаряме: Въвеждаме индекс
        // Стоп: Списъка като стане празен -> size <= 0
        // Продължаваме: Списака е пълен -> size > 0


        while (number.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());


            //1. index в списъка -> >= 0 и <= последния
            if (index >= 0 && index <= number.size() - 1) {
                //1. Взимам елемента на дадения индекс
                int removeElement = number.get(index);
                //2. Премахвам елемента на този индекс -> сумираме елемента
                sumRemoved += removeElement;
                number.remove(index);
                //3. Модифицирам списъка спрямо премахнатото число
                modifyList(number, removeElement);

            }
            //2. index < 0
            else if (index < 0) {
                //1. Взимаме първия елемент от списъка
                int firstElement = number.get(0); // Премахнатия елемент
                //2. Премахвам първия елемент от списъка -> сумираме елемента
                sumRemoved += firstElement;
                number.remove(0);
                //3. Взимаме последния елемент от списъка
                int lastElement = number.get(number.size() - 1);
                //4. Поставяме на index -> последния елемент
                number.add(0, lastElement);
                //5. Модифицирам списъка спрямо index
                // {3, 4, 8, 9, 12}
                modifyList(number, firstElement);

            }
            //3. index > последния
            else if (index > number.size() - 1) {
                //1. Взимаме последния елемент
                int lastElement = number.get(number.size() - 1);// Премахнатия елемент
                //2. Премахмваме последния елемент -> сумираме елемента
                sumRemoved += lastElement;
                number.remove(number.size() - 1);
                //3. Взимаме първия елемент
                int firstElement = number.get(0);
                //4. Слагаме първия елемент на мястото на index
                number.add(firstElement);
                //5 Модифицирам списъка -> премахнатия елемент е последния елемент
                modifyList(number,lastElement);
            }
        }
        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> number, int removeElement) {
        for (int indexInList = 0; indexInList <= number.size() - 1; indexInList++) {
            int currentElement = number.get(indexInList);

            if (currentElement <= removeElement) {
                currentElement += removeElement;
            } else {
                currentElement -= removeElement;
            }
            number.set(indexInList, currentElement);
        }
    }
}

