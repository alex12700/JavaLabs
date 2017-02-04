package labi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stud on 27.01.2017.
 */
public class Zd3 {
    public static void main(String[] args) {
        Map<String, Cat> koti = new HashMap<String, Cat>();
        for (int i = 1; i < 11; i++) {
            //Cat kot = new Cat();
            //kot.name = i;
            String imya = "kotik" + i;
            koti.put(imya, new Cat());
        }

        for (String key : koti.keySet()) {
            System.out.print(key + " = ");
            System.out.println(koti.get(key));
            System.out.println();
        }

        /*Cat kot_1 = new Cat();
        Cat kot_2 = new Cat();
        Cat kot_3 = new Cat();
        Cat kot_4 = new Cat();
        Cat kot_5 = new Cat();
        Cat kot_6 = new Cat();
        Cat kot_7 = new Cat();
        Cat kot_8 = new Cat();
        Cat kot_9 = new Cat();
        Cat kot_10 = new Cat();

        kot_1.name = "osya";
        kot_2.name = "vint";
        kot_3.name = "rigei";
        kot_4.name = "serei";
        kot_5.name = "belei";
        kot_6.name = "barsik";
        kot_7.name = "musya";
        kot_8.name = "loli";
        kot_9.name = "kamidzaka";
        kot_10.name = "hinata";

        koti.put(kot_1.name, kot_1);
        koti.put(kot_2.name, kot_2);
        koti.put(kot_3.name, kot_3);
        koti.put(kot_4.name, kot_4);
        koti.put(kot_5.name, kot_5);
        koti.put(kot_6.name, kot_6);
        koti.put(kot_7.name, kot_7);
        koti.put(kot_8.name, kot_8);
        koti.put(kot_9.name, kot_9);
        koti.put(kot_10.name, kot_10);

        for (String key : koti.keySet()) {
            System.out.print(key + " = ");
            System.out.println(koti.get(key));
            System.out.println();
        }*/
    }
}
