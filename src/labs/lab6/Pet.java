package labs.lab6;

/**
 * 2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст, Cat(кот) с полем
 * имя и Dog(собака) с полем имя. Унаследовать кота и собаку от животного.
 * В классах кот и собака реализовать методы вывода информации и о животных
 * 4. Скрыть все внутренние переменные класса Cat, добавить методы работы с этими переменными
 */
public class Pet {
    private float weigth = 1;
    private boolean woman = false;
    private int age = 1;

    public float getWeigth(){
        return weigth;
    }
    public boolean getWoman(){
        return woman;
    }
    public int getAge(){
        return age;
    }
}

class Cat extends Pet {
    private String name = "Karry-Catty";

    void outInform() {
        System.out.println("вес=" + getWeigth());
        System.out.println(getWoman() ? "это женщина" : "это мужчина");
        System.out.println("Возраст=" + getAge());
        System.out.println("имя=" + name);
    }
}

class Dog extends Pet {
    private String name = "Dogy-snoop";

    void outInform() {
        System.out.println("вес=" + getWeigth());
        System.out.println(getWoman() ? "это женщина" : "это мужчина");
        System.out.println("Возраст=" + getAge());
        System.out.println("имя=" + name);
    }
}
