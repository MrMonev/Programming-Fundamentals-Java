import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int typingLetters = Integer.parseInt(scanner.nextLine());

        StringBuilder massage = new StringBuilder();

        for (int i = 0; i < typingLetters; i++) {
            String input = scanner.nextLine();

            int numOfSymbols = input.length();
            char pressingNumbers = input.charAt(0);

            if (pressingNumbers == '2')       {if (numOfSymbols == 1) {
                    massage.append("a");} else if (numOfSymbols == 2) {
                    massage.append("b");} else if (numOfSymbols == 3) {
                    massage.append("c");
                }

            } else if
               (pressingNumbers == '3')       {if (numOfSymbols == 1) {
                    massage.append("d");} else if (numOfSymbols == 2) {
                    massage.append("e");} else if (numOfSymbols == 3) {
                    massage.append("f");
                }
            } else if
               (pressingNumbers == '4')       {if (numOfSymbols == 1) {
                    massage.append("g");} else if (numOfSymbols == 2) {
                    massage.append("h");} else if (numOfSymbols == 3) {
                    massage.append("i");
                }
            } else if
               (pressingNumbers == '5')       {if (numOfSymbols == 1) {
                    massage.append("j");} else if (numOfSymbols == 2) {
                    massage.append("k");} else if (numOfSymbols == 3) {
                    massage.append("l");
                }
            } else if
               (pressingNumbers == '6')       {if (numOfSymbols == 1) {
                    massage.append("m");} else if (numOfSymbols == 2) {
                    massage.append("n");} else if (numOfSymbols == 3) {
                    massage.append("o");
                }
            } else if
               (pressingNumbers == '7')       {if (numOfSymbols == 1) {
                    massage.append("p");} else if (numOfSymbols == 2) {
                    massage.append("r");} else if (numOfSymbols == 3) {
                    massage.append("s");} else if (numOfSymbols == 4) {
                    massage.append("s");
            }
            } else if
               (pressingNumbers == '8')       {if (numOfSymbols == 1){
                    massage.append("t");} else if (numOfSymbols == 2) {
                    massage.append("u");} else if (numOfSymbols == 3) {
                    massage.append("v");
                }
            } else if
               (pressingNumbers == '9')       {if (numOfSymbols == 1){
                    massage.append("w");} else if (numOfSymbols == 2) {
                    massage.append("x");} else if (numOfSymbols == 3) {
                    massage.append("y");} else if (numOfSymbols == 4) {
                    massage.append("z");
                }
            } else if
               (pressingNumbers == '0') {
                    massage.append(" ");
            }
        }
        System.out.println(massage);

    }

}