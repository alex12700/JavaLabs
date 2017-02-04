package labs.Lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Алексаелп on 29.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, String> pari_chegoto = new HashMap<String, String>();
        pari_chegoto.put("арбуз","ягода" );
        pari_chegoto.put("банан","трава" );
        pari_chegoto.put("вишня","ягода" );
        pari_chegoto.put("груша","фрукт" );
        pari_chegoto.put("дыня","овощ" );
        pari_chegoto.put("ежевика","куст" );
        pari_chegoto.put("жень-шень","корень" );
        pari_chegoto.put("земляника","ягода" );
        pari_chegoto.put("ирис","цветок" );
        pari_chegoto.put("картофель","клубень" );

        for (String key : pari_chegoto.keySet()){
            System.out.print(key + " = ");
            System.out.println(pari_chegoto.get(key));
            System.out.println();
        }
    }
}
