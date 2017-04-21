package labs.lab7_1;

/**
 * 1.	Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: Я не корова, Я – кит.
 */
public class Cow {
    public void printAll()
    {
        printColor();
        printName();
    }
    public void printColor()
    {
        System.out.println("Я – белый");
    }
    public void printName()
    {
        System.out.println("Я – корова");
    }

}

class Whale extends Cow {
    public void printName()
    {
        System.out.println("я не корова, я - кит");
    }
}
