//1 уровень сложности: 2. * Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5
public class Main {
    public static void main(String[] args) {

        int num = 345;

        int dig1 = num / 100;
        int dig2 = (num / 10) % 10;
        int dig3 = num % 10;

        System.out.print("Число "+num+" -> " +dig1);
        System.out.print(", " + dig2);
        System.out.println(", " + dig3);

    // Второй способ.
        System.out.print("Число "+num+" -> ");
        String nummer = String.valueOf(num);
        for (int i = 0; i < nummer.length();i++ ){
            System.out.print(nummer.charAt(i)+", ");
        }
    }
}


