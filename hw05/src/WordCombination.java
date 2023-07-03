import java.util.Scanner;

public class WordCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        if (isEvenLength(word1) && isEvenLength(word2)) {
            String combinedWord = combineWords(word1, word2);
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны содержать четное количество букв.");
        }
    }

    public static boolean isEvenLength(String word) {
        return word.length() % 2 == 0;
    }

    public static String combineWords(String word1, String word2) {
        int halfLength = word1.length() / 2;
        String firstHalf = word1.substring(0, halfLength);
        String secondHalf = word2.substring(halfLength);

        return firstHalf + secondHalf;
    }
}






