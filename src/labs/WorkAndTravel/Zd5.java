package labi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stud on 27.01.2017.
 */
public class Zd5 {
    public static void main(String[] args) {
        Map<String, Cat> kol = new HashMap<String, Cat>();
        for (int i = 1; i < 11; i++) {
            //Cat kot = new Cat();
            //kot.name = i;
            String imya = "Slim_" + i;
            kol.put(imya, new Cat());
        }

        for (String key : kol.keySet()) {
            System.out.print(key + " = ");
            System.out.println(kol.get(key));
            System.out.println();
        }
    }
}
