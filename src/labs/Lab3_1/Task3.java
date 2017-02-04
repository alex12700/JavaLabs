package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Алексаелп on 29.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Cat> koti = new HashMap<String, Cat>();
        for (int i = 1; i < 11; i++) {
            String imya = "kotik" + i;
            koti.put(imya, new Cat());
        }

        for (String key : koti.keySet()) {
                System.out.print(key + " = ");
                System.out.println(koti.get(key));
                System.out.println();
        }
    }
}
