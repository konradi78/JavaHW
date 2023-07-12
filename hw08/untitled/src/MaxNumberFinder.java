import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();

        int maxNumber = findMax(number1, number2, number3);

        System.out.println("Максимальное число: " + maxNumber);
    }

    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}