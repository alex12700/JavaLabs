package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Алексаелп on 29.01.2017.
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
