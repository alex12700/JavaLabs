package labi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringJoiner;

/**
 * Created by Stud on 27.01.2017.
 */
public class Zd1 {
    public static void main(String[] args) {
        Set<String> fructs = new HashSet<String>();

        fructs.add("арбуз");
        fructs.add("банан");
        fructs.add("вишня");
        fructs.add("груша");
        fructs.add("дыня");
        fructs.add("ежевика");
        fructs.add("жень-шень");
        fructs.add("земляника");
        fructs.add("ирис");
        fructs.add("картофель");

        for (String text : fructs){
            System.out.println(text);
        }
    }

}

