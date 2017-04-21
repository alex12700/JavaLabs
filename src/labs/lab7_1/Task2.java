package labs.lab7_1;

/**
 * 2.	Написать метод, который определяет, объект какого класса ему передали,
 * и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Task2 {
    public static void solution(Object object){
        if (object instanceof Cat) System.out.println("it's a cat");
        if (object instanceof Dog) System.out.println("it's a dog");
        if (object instanceof Bird) System.out.println("it's a bird");
        if (object instanceof Lamp) System.out.println("it's a lamp");
        if (object instanceof Whale) System.out.println("it's a whale");
        if (object instanceof Cow) System.out.println("it's a cow");
    }

    public static void main(String[] args) {
        Cow qwe = new Whale();
        Task2.solution(qwe);
        qwe.printName();
    }
}

class Bird {
}
class Lamp {
}
