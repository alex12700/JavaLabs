package labs.lab4;

/**
 * 3.	Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = -i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        sort(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //рдин из вариантов ррешения задачи
//    public static void sort(int[] a) {
//        for (int i = a.length - 1; i >= 2; i--) {
//            boolean sorted = true;
//            for (int j = 0; j < i; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                    sorted = false;
//                }
//            }
//            if (sorted) {
//                break;
//            }
//        }
//    }


//        for (int j = 0; j < intArray.length; j++)
//            for (int k = 0; k < intArray.length - 1; k++) {
//                if (intArray[k] < intArray[k + 1]) {
//                    temp = intArray[k];
//                    intArray[k] = intArray[k + 1];
//                    intArray[k + 1] = temp;
//                }
//            }

    //ломанный сортировщик
//        public static void sort(int[] a) {
//            int temp = 0;
//            for (int i = 0; i < 20; i++) {
//                if (a[i] < a[i + 1])
//                    temp = a[i];
//                a[i] = a[i + 1];
//                a[i + 1] = temp;
//            }
//        }
}
