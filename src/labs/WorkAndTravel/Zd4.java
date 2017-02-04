package labi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stud on 27.01.2017.
 */
public class Zd4 {
    public static void main(String[] args) {
        Map<String, String> kolekciya = new HashMap<String, String>();
        for (int i =1; i <= 10; i++){
            kolekciya.put("key" + i, "value" + i);
        }

        for (String key : kolekciya.keySet()){
            System.out.print(key + " = ");
            System.out.println(kolekciya.get(key));
            System.out.println();
        }
    }
}
