import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Простой консольный калькулятор");
        System.out.print("Введите первое число: ");
        double a = readDouble(sc);
        System.out.print("Введите оператор (+, -, *, /, ^ для степени): ");
        String op = sc.next().trim();
        System.out.print("Введите второе число: ");
        double b = readDouble(sc);

        double result;
        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                    sc.close();
                    return;
                }
                result = a / b;
            }
            case "^" -> result = Math.pow(a, b);
            default -> {
                System.out.println("Неизвестный оператор: " + op);
                sc.close();
                return;
            }
        }

        System.out.println("Результат: " + result);
        sc.close();
    }

    public static int add()
        substruct


    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Некорректное число. Введите снова: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
