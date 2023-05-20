import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String calc(String input) {
        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("//т.к. строка не является математической операцией или формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (a < 1 || a > 10 || b < 1 || b > 10){
            throw new IllegalArgumentException("//числа должны быть в диапазоне от 1 до 10 включительно");
        }
        int result;
        switch (tokens[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("//деление на ноль");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция: " + tokens[1]);
        }
        return String.valueOf(result);
    }
}