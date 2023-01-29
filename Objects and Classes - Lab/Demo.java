
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static class Dice {

        private  int side; // Създаваме името на нашия обект

        public Dice(int side) {
            this.side = side; // Примеа стойноста (int side - 6)
        }
        public Dice() {

        }
         public Dice (int bound, int side) {
             Random rnd = new Random();
             this.side = rnd.nextInt(bound);
         }
        public int getSide() {
            return  this.side; // Взема същата стойност (int side - 6)
        }
        public  void setSide (int side)  {
            this.side = side;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      Dice dice = new Dice(3); // Декларираме стойноста

        System.out.println(dice.getSide());
    }
}
