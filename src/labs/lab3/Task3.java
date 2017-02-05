package labs.lab3;

import static java.lang.Math.*;

/**
 * Created by admin on 02.02.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[15];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println();
        System.out.println(j);
    }
}
