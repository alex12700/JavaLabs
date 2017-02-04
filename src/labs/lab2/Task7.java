package labs.lab2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите x:");
        int ox = dan.nextInt();
        System.out.println("Введите y:");
        int oy = dan.nextInt();

        if (ox < 0 && oy < 0) {
            System.out.println("3 четверть");
        }else if (ox > 0 && oy < 0) {
            System.out.println("4 четверть");
        }else if (ox > 0 && oy > 0) {
            System.out.println("1 четверть");
        }else if (ox < 0 && oy > 0) {
            System.out.println("2 четверть");
        }else System.out.println("где то на границе двух четвертей или в центре");
    }
}
