package labs.lab2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите имя1:");
        String name1 = dan.next();
        System.out.println("Введите имя2:");
        String name2 = dan.next();

        if (name1.equals(name2)) {
            System.out.println("имена одинаковые");
        }else if (name1.length() == name2.length()) {
            System.out.println("длины имен одинаковые");
        }else System.out.println("имена никак не совпадают");
    }
}
