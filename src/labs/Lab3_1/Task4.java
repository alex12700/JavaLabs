package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 4.	Вывести на экран список ключей Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 */
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> collection = new HashMap<String, String>();
        for (int i = 1; i <= 10; i++) {
            collection.put("key" + i, "value" + i);
        }

        for (String key : collection.keySet()) {
            System.out.println(key);
        }
    }
}
