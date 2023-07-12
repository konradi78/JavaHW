import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeap(year);

        if (isLeapYear) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
