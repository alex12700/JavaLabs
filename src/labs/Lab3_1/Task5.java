package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 6.	Коллекция HashMap из Object Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 */
public class Task5 {
    public static void main(String[] args) {
        Map<String, Cat> collection = new HashMap<String, Cat>();
        for (int i = 1; i <= 10; i++) {
            collection.put("name" + i, new Cat());
        }

        for (String key : collection.keySet()) {
            System.out.println(key + " = " + collection.get(key));
        }
    }
}
