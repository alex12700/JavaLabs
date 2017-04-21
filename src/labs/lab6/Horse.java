package labs.lab6;

import java.util.Scanner;

/**
 * 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и
 * Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). Унаследовать пегаса от лошади.
 */
public class Horse {
    String name = "Pegasus";

    public Horse (){
        Scanner dan = new Scanner(System.in);
        name = dan.nextLine();
    }
}

class Pegas extends Horse {
    public void fly() {
        System.out.println(name + " is fly!");
    }
}