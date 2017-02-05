package labs.Lab3_1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.	HashSet из растений Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов
 */
public class Task1 {
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
