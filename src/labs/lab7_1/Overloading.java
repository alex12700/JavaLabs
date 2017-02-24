package labs.lab7_1;

/**
 * 1.	Написать два метода: print(int) и print(String).
 * 2.	Написать два метода: print(int) и print(Integer).Написать такой код в методе main, чтобы вызвались они оба.
 * 3.	Написать пять методов print с разными параметрами.
 * 4.	Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 * 5.	Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */
public class Overloading {
    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(Integer x) {
        System.out.println(x);
    }

    public static void print(String x) {
        System.out.println(x);
    }

    public static void print(boolean x) {
        System.out.println(x);
    }

    public static void print(float x) {
        System.out.println(x);
    }

    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static long min(long x, long y) {
        return x < y ? x : y;
    }

    public static double min(double x, double y) {
        return x < y ? x : y;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static long max(long x, long y) {
        return x > y ? x : y;
    }

    public static double max(double x, double y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        int x = 15;
        print(15);
        Integer x2 = 45;
        print(x2);
    }
}
