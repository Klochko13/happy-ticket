import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[6];
        Scanner key = new Scanner(System.in);
        System.out.println("Введите номер билета (6 цифр)");
        int num = key.nextInt();
        for (int i = 0; i < 6; i++) {
            x[i] = num % 10;
            num = num / 10;
        }
        if (x[0] + x[1] + x[2] == x[3] + x[4] + x[5])
            System.out.println("Ваш билет счастливый!");
        else
            System.out.println("У Вас обычный билет :-(");
    }
}