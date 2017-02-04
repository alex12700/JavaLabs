package labs.lab2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = dan.nextInt();
        System.out.println("Введите y:");
        int y = dan.nextInt();
        comparison(x,y);
    }

    public static void comparison(int x, int y) {
        if (x == y) {
            System.out.println("x = y");
        }else if (x > y) {
            System.out.println("x > y");
        }else
            System.out.println("x < y");
    }
}
