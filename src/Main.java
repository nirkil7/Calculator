import java.io.IOException;
import java.util.Scanner;
class Main {
    public static String calc(String input) throws IOException {
        Scanner inputString = new Scanner(System.in);
        String input1 = inputString.nextLine();
        String[] calc_inputString = input1.split(" ");
        if (calc_inputString.length != 3) {
            throw new IOException();
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        Scanner inputString = new Scanner(System.in);
        String input1 = inputString.nextLine();
        String[] calc_inputString = input1.split(" ");
        String operation = calc_inputString[1];
        if (calc_inputString.length != 3) {
            throw new IOException();
        }
        int value1 = 0;
        int value2 = 0;
        value1 = Integer.parseInt(calc_inputString[0]);
        value2 = Integer.parseInt(calc_inputString[2]);
        int result = 0;
        if (value1 < 1 | value1 > 10 | value2 < 1 | value2 > 10) {
            throw new IOException();
        }
        switch (operation) {
            case "-" -> result = value1 - value2;
            case "+" -> result = value1 + value2;
            case "*" -> result = value1 * value2;
            case "/" -> result = value1 / value2;
            default -> throw new IOException();
        }
        System.out.print(result);
    }
}