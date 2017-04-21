package labs.lab5;

import labs.lab4.Task1;

import java.util.Scanner;

/**
 * 1.	Создайте в классе Circle метод, вычисляющий длину окружности.
 * 2.	Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости
 * с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый
 * к уже существующему объекту, а не конструктор создающий новый объект.
 * 3.	Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
 * координаты центра и радиус окружности пользователь вводил с клавиатуры.
 * 4.	Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
 * 5.	Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен вариант,
 * когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.
 */
public class Circle {
    private int x;
    private int y;
    private int r;

    public void line_circle() {
        System.out.println(Math.PI * r * 2);
    }

    public void random_center() {
        x = Task1.two_variables(-99, 99);
        y = Task1.two_variables(-99, 99);
        System.out.println(x + "   " + y);
    }

    public Circle() {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите x");
        x = dan.nextInt();
        System.out.println("Введите y");
        y = dan.nextInt();
        System.out.println("Введите r");
        r = dan.nextInt();
    }

    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static void srav(Circle ciro, Circle cira){
        if (ciro.r > cira.r)
            System.out.println(ciro.r);
        else
            System.out.println(cira.r);
    }

    public void distans(Circle cir) {
        double dx = x - cir.x;
        double dy = y - cir.y;
        System.out.println("расстояние = " + Math.hypot(dx, dy));
    }

    public void two_circle(Circle cir) {
        double dx = this.x - cir.x;
        double dy = this.y - cir.y;
        double dr = this.r + cir.r;
        double dist = Math.hypot(dx, dy) - dr;
        double extra = Math.hypot(dx, dy) + (this.r < cir.r ? this.r : cir.r) - (this.r > cir.r ? this.r : cir.r);
        if (dist == 0 || extra == 0) System.out.println("касаются");
        else System.out.println("не касаются");
    }
}
