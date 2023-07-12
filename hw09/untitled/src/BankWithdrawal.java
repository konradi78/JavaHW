import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму на банковском счету: ");
        int N = scanner.nextInt();

        int days = calculateWithdrawalDays(N);

        System.out.println("Для снятия всех денег понадобится " + days + " дней.");
    }

    public static int calculateWithdrawalDays(int N) {
        int days = 0;
        while (N > 0) {
            boolean withdrawn = false;
            for (int amount = N - 1; amount > 0; amount--) {
                if (N % amount == 0) {
                    N -= amount;
                    withdrawn = true;
                    System.out.println("День: " + (days + 1) + ", Снято: " + amount + ", Остаток: " + N);
                    break;
                }
            }
            if (!withdrawn) {
                N -= 1;
                System.out.println("День: " + (days + 1) + ", Снято: 1, Остаток: " + N);
            }
            days += 1;
        }
        return days;
    }
}
