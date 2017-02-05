package labs.lab3;

/**
 * Created by admin on 02.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array;
        array = new int[50];
        for (int i = 0; i <= 49; i++) {
            array[i] = i*2+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
