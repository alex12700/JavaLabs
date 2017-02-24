package labs.lab4;

/**
 * 2.	Создать метод, который будет выводить указанный массив на экран в строку.
 * С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов
 * из 10 элементов каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        int[] array3 = new int[20];
        int[] array4 = new int[20];
        int[] array5 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Task1.two_variables(20,10);
            array2[i] = Task1.two_variables(20,10);
            array3[i] = Task1.two_variables(20,10);
            array4[i] = Task1.two_variables(20,10);
            array5[i] = Task1.two_variables(20,10);
        }
        output_array(array1);
        output_array(array2);
        output_array(array3);
        output_array(array4);
        output_array(array5);
    }

    public static void output_array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
