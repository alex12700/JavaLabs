package labs.lab2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите m:");
        int m = dan.nextInt();
        System.out.println("Введите n:");
        int n = dan.nextInt();

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("8 ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
