package labs.lab7_2;

/**
 * 1.	Сделать класс Pet (лабораторная работа №6) абстрактным.
 2.	Создать абстрактный класс Pet с полями name, age, hungry(хочет есть) и абстрактный метод voice(голос).
 Создать классы Snake, Dog, PatrolDog, Cat, Fish и наследники класса Pet. В каждом классе реализовать метод voice.

 */
public abstract class Pet {
    float weigth = 1;
    boolean woman = false;

    public float getWeigth(){
        return weigth;
    }
    public boolean getWoman(){
        return woman;
    }
    public int getAge(){
        return age;
    }

    String name = "qwe";
    int age = 1;
    boolean hungry = false;
    abstract void voice ();
}

class Cat extends Pet {
    @Override
    public void voice() {
        System.out.println("meow-meow");
    }
}

class Fish extends Pet {
    @Override
    public void voice() {
        System.out.println("я испольню 3 твоих желания(только если я волшебная щука или золотая рыбка)\n " +
                "а пока, пока-пока, да и вообще я не умею разговаривать!");
    }
}

class Dog extends Pet {
    @Override
    public void voice() {
        System.out.println("gav-gav");
    }
}

class PatrolDog extends Pet {
    @Override
    public void voice() {
        System.out.println("don `t move! gav-gav");
    }
}

class Snake extends Pet {
    @Override
    public void voice(){
        System.out.println("šúva šé, néda véš");
    };
}