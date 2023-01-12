import java.util.Scanner;

public class  NumOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfStarts = scanner.nextInt();


        for (int i = 1; i <= numOfStarts ; i++) {
            for (int j = 0; j < i ; j++) {


                System.out.printf("%d ",i);
            }
            System.out.println();

        }

    }
}