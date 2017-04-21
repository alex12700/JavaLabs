package labs.lab4;

import java.util.Date;

/**
 * 1.	Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
 * вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
 */
public class Task4 {
    public static void main(String[] args) {
        long dif;
        int i = 0;
        do {
            i++;
            Date start = new Date();
            System.out.println(i + " " + fib(i));
            Date end = new Date();
            dif = end.getTime() - start.getTime();
        } while (dif < 60000);
        System.out.println("найден тот самый номер:" + i);
    }

    static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
