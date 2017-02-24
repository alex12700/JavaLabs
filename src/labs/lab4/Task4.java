package labs.lab4;

import java.util.Date;

/**
 * Created by Алексаелп on 05.02.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Date start = new Date();
            System.out.println(i + " " + fib(i));
            Date end = new Date();
            long dif = end.getTime() - start.getTime();
            if (dif > 60000) {
                System.out.println("найден тот самый номер:" + i);
                break;
            }
        }
    }


    static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
