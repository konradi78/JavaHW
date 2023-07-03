public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 12;

        int sumResult = add(num1, num2);
        int subtractResult = subtract(num1, num2);
        int multiplyResult = multiply(num1, num2);
        double divideResult = divide(num1, num2);

        System.out.println("Результат сложения: " + sumResult);
        System.out.println("Результат вычитания: " + subtractResult);
        System.out.println("Результат умножения: " + multiplyResult);
        System.out.println("Результат деления: " + divideResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}