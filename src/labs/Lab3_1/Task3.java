package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 3.	Коллекция HashMap из котов Есть класс Cat, с полем имя (name, String).Создать коллекцию HashMap<String, Cat>. Добавить в коллекцию 10 котов,
 * в качестве ключа использовать имя кота. Вывести результат на экран, каждый элемент с новой строки
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        for (int i = 1; i < 11; i++) {
            String imya = "kotik" + i;
            cats.put(imya, new Cat());
        }

        for (String key : cats.keySet()) {
                System.out.print(key + " = ");
                System.out.println(cats.get(key));
        }
    }
}
