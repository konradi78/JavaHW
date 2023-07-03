import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532;
        long myLong = 12121;

        System.out.println("Character: " + myChar);
        System.out.println("Integer: " + myInt);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Long: " + myLong);

        Scanner scanner = new Scanner(System.in);
        System.out.println("this is from keyboard:" + scanner.nextLine());



    }
}