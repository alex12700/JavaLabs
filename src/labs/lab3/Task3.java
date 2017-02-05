package labs.lab3;

import static java.lang.Math.*;

/**
 * 3.	Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
 * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println();
        System.out.println("количество четных элементов: " + j);
    }
}
