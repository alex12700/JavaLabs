package labs.lab6;

/**
 * Created by Алексаелп on 20.02.2017.
 */
public class Dog extends Pet {
    String name = "Dogy-snoop";

    static void outInform() {
        Dog dog = new Dog();
        System.out.println("вес=" + dog.weigth);
        System.out.println(dog.woman ? "это женщина" : "это мужчина");
        System.out.println("Возраст=" + dog.age);
        System.out.println("имя=" + dog.name);
    }

    public static void main(String[] args) {
        outInform();
    }
}
