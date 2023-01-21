import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DEMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//List<String> listString = new ArrayList<>(Arrays.asList(
//        "Sniper, Pistol, Knife, flash"
//));
//
//
//        System.out.println(String.join(" ", listString));

//////////////////////////////////////////////////////////////////////
//        // 10 20 30 40 50
//        String lineInput = scanner.nextLine();
//        List<String> itemsList = Arrays.stream(lineInput.split(" "))
//                .collect(Collectors.toList());
//
//        List<Integer> numbersList = new ArrayList<>();
//        for (int i = 0; i < itemsList.size() ; i++) {
//            String currentItem = itemsList.get(i);
//            int currentNum = Integer.parseInt(currentItem);
//            numbersList.add(currentNum);
//        }
//
//        System.out.println();

        /////////////////////////////////////////////////////////////////////////
//   Съкратен вариант на това отгоре как да превърен String в цяло число
//        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
//                map(Integer::parseInt)
//                .collect(Collectors.toList());
        //////////////////////////////////////////////////////////



//        int n = Integer.parseInt(scanner.nextLine());
//
//        List<Integer> numbersList = new ArrayList<>();
//        for (int i = 0; i < n ; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            numbersList.add(currentNum);
//        }
//////////////////////////////////////////////////////////////////////
//
//        int totalPrice = 10;
//        List<String> nameList = new ArrayList<>();
//
//        nameList.add("Ivaylo");
//        nameList.add("Tihomirov");
//        nameList.add("Monev");
//        nameList.add(0, "The King"); // Вмъкваме елемент на дадена позиция,
//        // ако не зададем позицията отива на последно място
//
//        nameList.set(3, "KingMonev");
//        if (nameList.contains("Ivaylo")) { // Булева проверка проверява дали имаме даденият елемент
//            System.out.println("What's up"); // ако го има принтира ако го няма връща false
//        }
////////////////////////////////////////////////////////////////////////
////        nameList.add(String.valueOf(totalPrice)); // Преобразува String към Int и добавя числото
////        nameList.remove("Ivaylo"); // Премахва даде елемент
////        nameList.remove(3); // Премахва елемент на даден индекс
////        nameList.clear(); // Изчиства всички елементи
////        nameList.set(3, "KingMonev"); // Замества елемента на дадения индес с подадения ни елемент
////////////////////////////////////////////////////////////////////////
//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(nameList.get(i)); // nameList.get(дай ми на позиция i)

        }
    }
