import java.util.Scanner;

public class DeviceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение температуры первой колбы: ");
        int temperature1 = scanner.nextInt();

        System.out.print("Введите значение температуры второй колбы: ");
        int temperature2 = scanner.nextInt();

        boolean isDeviceWorking = checkDevice(temperature1, temperature2);

        System.out.println("Работает ли устройство: " + isDeviceWorking);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}