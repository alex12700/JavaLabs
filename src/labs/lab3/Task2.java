package labs.lab3;

/**
 * 2.	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i * 2 + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
