package labs.lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        Task6_dop Search = new Task6_dop();

        System.out.println("Введите число1:");
        int number1 = dan.nextInt();
        System.out.println("Введите число2:");
        int number2 = dan.nextInt();
        System.out.println("Введите число3:");
        int number3 = dan.nextInt();
        System.out.println("Введите число4:");
        int number4 = dan.nextInt();

        int otvenMinimuma = Search.min(number1, number2, number3, number4);
        System.out.println("наименьшее число из введенных: " + otvenMinimuma);

    }
}
