import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int totalLines = Integer.parseInt(scanner.nextLine());

      while (totalLines > 0) {
          String [] input = scanner.nextLine().split(" ");

          int sumOfAllDig = 0;

          long leftNumber = Long.parseLong(input[0]);
          long rightNumber = Long.parseLong(input[1]);


          if (leftNumber >= rightNumber){

              for (int index = 0; index < input[0].length() ; index++) {
                    sumOfAllDig += Math.abs(leftNumber % 10);
                    leftNumber = leftNumber / 10;
              }
          } else {
              for (int index = 0; index < input[1].length() ; index++) {
                  sumOfAllDig += Math.abs(rightNumber % 10);
                  rightNumber = rightNumber / 10;
              }
          }
          System.out.println(sumOfAllDig);
          totalLines--;
      }
    }
}
