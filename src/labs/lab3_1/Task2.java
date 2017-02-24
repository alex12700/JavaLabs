package labs.lab3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.	HashMap из 10 пар Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз - ягода, банан - трава,
 * вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, String> collection = new HashMap<String, String>();
        collection.put("арбуз","ягода" );
        collection.put("банан","трава" );
        collection.put("вишня","ягода" );
        collection.put("груша","фрукт" );
        collection.put("дыня","овощ" );
        collection.put("ежевика","куст" );
        collection.put("жень-шень","корень" );
        collection.put("земляника","ягода" );
        collection.put("ирис","цветок" );
        collection.put("картофель","клубень" );

        for (String key : collection.keySet()){
            System.out.print(key + " = ");
            System.out.println(collection.get(key));
        }
    }
}
