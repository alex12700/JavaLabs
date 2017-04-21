package labs.lab6;

import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * 3. Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
 * Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
 * Поля и методы разработать самостоятельно.
 */

public class Fish {
    private int hungry = 0;

    public static void pause(double seconds) {
        try {
            sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat(int food) {
        System.out.println("начинаем кушать");
        pause(food);
        hungry -= food;
        if (hungry < 0) {
            System.out.println("я объелся в меня больше не влезет");
        } else
            System.out.println("вот и поели, я мог бы съесть еще " + hungry);
    }

    public void swimming(int metr) {
        System.out.println("поплыли");
        pause(0.4*metr);
        System.out.println("приплыли");
    }
}

class Animal extends Fish {
    private int drying_up = 0;

    public void drink() {
        System.out.println("начинаем пить");
        pause(1);
        drying_up = 0;
        System.out.println("меня больще не мучает жажда");
    }

    public void survival(int metr) {
        System.out.println("run animal, run");
        pause(metr / 4);
        if (metr < (int) (Math.random() * 10)) {
            System.out.println("очень жаль, но нас догнали и съели :(\n" +
                    "game over");
            System.exit(0);
        } else
            System.out.println("we survived!");
        drying_up += metr;
    }
}

class Ape extends Animal {
    public void gathering_hunting() {
        System.out.println("gathering and hunting");
        pause(5);
        System.out.println("мы собрали нужное колличество еды\n" +
                "мы больше не нуждаемся в еде и воде\n" +
                "пора строить цивилизацию");
    }
    public void create_new_civilization(){
        System.out.println("начинаем создавать новую эпоху\n" +
                "это будет прорыв, но его придется долго ждать");
        pause(300);
    }
}

class Human extends Ape {
    public static void destroy_everyThing(){
        System.out.println("мы уничтожили сами себя\n " +
                "GAME OVER");
        System.exit(0);
    }
    public static void programming(){
        for (int i = 0; i < 60; i++) {
            System.out.println("programming");
            pause(1);
        }
        System.out.println("HAPPY END");
        System.exit(0);
    }
}
