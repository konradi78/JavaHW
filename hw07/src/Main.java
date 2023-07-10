import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число m: ");
        double m = scanner.nextDouble();

        System.out.print("Введите число n: ");
        double n = scanner.nextDouble();

        printClosestTo10(m, n);
        System.out.println("-----------------------------------------------");

        printRemainingHours();
    }

    public static void printClosestTo10(double m, double n) {
        double diff_m = Math.abs(m - 10);
        double diff_n = Math.abs(n - 10);

        if (diff_m < diff_n) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (diff_n < diff_m) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
        }
    }

    public static void printRemainingHours() {
        Random random = new Random();
        int n = random.nextInt(28800);
        System.out.println("Количество секунд: " + n);

        int hours = n / 3600;

        if (hours > 4) {
            System.out.println("Осталось " + hours + " часов.");
        }
        else if (hours > 1) {
            System.out.println("Осталось " + hours + " часа.");
        }
        else if (hours == 1) {
            System.out.println("Остался " + hours + " час.");
        }
        else {
            System.out.println("Осталось менее часа.");
        }
    }
}