import java.util.Scanner;

class Addition {
    double calc(double a, double b) {
        return a + b;
    }
}

class Subtraction {
    double calc(double a, double b) {
        return a - b;
    }
}

class Multiplication {
    double calc(double a, double b) {
        return a * b;
    }
}

class Division {
    double calc(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка! Деление на ноль!");
            return 0;
        }
        return a / b;
    }
}

class Power {
    double calc(double a, double b) {
        return Math.pow(a, b);
    }
}

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Калькулятор на классах :)");
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, ^): ");
        String op = sc.next();

        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        double result = 0;

        if (op.equals("+")) {
            Addition add = new Addition();
            result = add.calc(a, b);
        } else if (op.equals("-")) {
            Subtraction sub = new Subtraction();
            result = sub.calc(a, b);
        } else if (op.equals("*")) {
            Multiplication mul = new Multiplication();
            result = mul.calc(a, b);
        } else if (op.equals("/")) {
            Division div = new Division();
            result = div.calc(a, b);
        } else if (op.equals("^")) {
            Power pow = new Power();
            result = pow.calc(a, b);
        } else {
            System.out.println("Неизвестный оператор: " + op);
            sc.close();
            return;
        }

        System.out.println("Результат: " + result);
        sc.close();
    }
}
