import java.util.Scanner;

public class EnglishNameOfTheLastDigit
{
     public   static void main(String[] args)

       {

            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            int lastDigit = number % 10;

            String name =
                    lastDigit == 1 ? "one" :
                            lastDigit == 2 ? "two" :
                                    lastDigit == 3 ? "three" :
                                            lastDigit == 4 ? "four" :
                                                    lastDigit == 5 ? "five" :
                                                            lastDigit == 6 ? "six" :
                                                                    lastDigit == 7 ? "seven" :
                                                                            lastDigit == 8 ? "eight" :
                                                                                    lastDigit == 9 ? "nine" : "zero";

           System.out.println(name);
        }
    }






