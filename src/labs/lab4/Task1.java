package labs.lab4;

/**
 * 1.	Создать статический метод, который будет иметь два целочисленных параметра a и b,
 * и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
 * C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = two_variables(two_variables(100, 0), two_variables(100, 0));
            System.out.println(array[i]);
        }
    }

    public static int two_variables(int a, int b) {
        return (int) (Math.random() * (b - a + 3) + a - 1);
    }
}
