package labi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Stud on 27.01.2017.
 */
public class Primer {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }

        Set<Integer> sta = new HashSet<Integer>();
        sta.add(1);
        sta.add(2);
        sta.add(3);

        for (int text : sta)
        {
            System.out.println(text);
        }
    }
}
