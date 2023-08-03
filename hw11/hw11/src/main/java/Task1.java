public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findMissing(arr1)); // output: 4

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println(findMissing(arr2)); // output: 9
    }

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2; // сумма арифметической прогрессии
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return total - sum;
    }
}