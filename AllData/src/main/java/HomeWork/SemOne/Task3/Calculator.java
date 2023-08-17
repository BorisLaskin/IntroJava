package HomeWork.SemOne.Task3;

public class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return -1;

        }

    }
}
