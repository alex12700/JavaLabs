package labs.lab3;

/**
 * 5.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] array = new int[7][4];
        int max = 0;
        int stroka = 0;
        for (int i = 0; i < 7; i++) {
            int x = 1;
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 12 - 6);
                System.out.print(array[i][j] + " ");
                x *= Math.abs(array[i][j]);
            }
            System.out.println();
            if (x > max) {
                max = x;
                stroka = i + 1;
            }
        }
        System.out.println("строка " + stroka);
        System.out.println("наибольшее произведение: " + max);
    }
}
