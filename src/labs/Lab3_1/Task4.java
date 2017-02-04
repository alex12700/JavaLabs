package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Алексаелп on 29.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> collection = new HashMap<String, String>();
        for (int i =1; i <= 10; i++){
            collection.put("key" + i, "value" + i);
        }

        for (String key : collection.keySet()){
            System.out.print(key + " = ");
            System.out.println(collection.get(key));
            System.out.println();
        }
    }
}
