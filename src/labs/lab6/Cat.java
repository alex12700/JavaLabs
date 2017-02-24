package labs.lab6;

/**
 * Created by Алексаелп on 20.02.2017.
 */
public class Cat extends Pet {
    private String name = "Karry-Catty";

    void outInform() {
        System.out.println("вес=" + weigth);
        System.out.println(woman ? "это женщина" : "это мужчина");
        System.out.println("Возраст=" + age);
        System.out.println("имя=" + name);
    }

    void setName(String eee) {
        name = eee;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Vasya");
        cat.outInform();
    }
}
