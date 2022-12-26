import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int extraTime = hours * 60 + minutes + 30;

        hours = extraTime / 60;
        minutes = extraTime % 60;

        if (hours > 23) {
           hours = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d",hours, minutes);
        }


        }
    }
