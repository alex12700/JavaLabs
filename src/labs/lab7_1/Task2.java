package labs.lab7_1;

/**
 * Created by Алексаелп on 23.02.2017.
 */
public class Task2 {
    public static void solution(Object object){
        if (object instanceof Cat) System.out.println("it's a cat");
        if (object instanceof Dog) System.out.println("it's a dog");
        if (object instanceof Bird) System.out.println("it's a bird");
        if (object instanceof Lamp) System.out.println("it's a lamp");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        solution(dog);
        dog.getChild();
    }
}
