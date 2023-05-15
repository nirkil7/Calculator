import java.io.IOException;
import java.util.*;
class Main {
    public static String calc(String input) throws IOException {
        String[] calc_inputString = input.split(" ");
        if (calc_inputString.length != 3) {
            throw new IOException();
        }
        return input;
    }
    public static void main(String[] args) throws IOException {
        Scanner inputString = new Scanner(System.in);
        String input = inputString.nextLine();
        String[] calc_inputString = input.split(" ");
        int result = 0;
        int value1 = 0;
        int value2 = 0;
        String operation = calc_inputString[1];
        value1 = Integer.parseInt(calc_inputString[0]);
        value2 = Integer.parseInt(calc_inputString[2]);
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