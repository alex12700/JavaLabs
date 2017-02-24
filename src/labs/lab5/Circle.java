package labs.lab5;

import labs.lab4.Task1;

import java.util.Scanner;

/**
 * Created by Алексаелп on 12.02.2017.
 */
public class Circle {
    private int x;
    private int y;
    private int r;

    void line_circle() {
        System.out.println(Math.PI * r * 2);
    }

    void random_center() {
        x = Task1.two_variables(-99,99);
        y = Task1.two_variables(-99,99);
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

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void distans(int x2, int y2) {
        double dx = x - x2;
        double dy = y - y2;
        System.out.println("расстояние = " + Math.hypot(dx, dy));
    }

    void two_circle(Circle cir) {
        double dx = this.x - cir.x;
        double dy = this.y - cir.y;
        double dr = this.r + cir.r;
        double dist = Math.hypot(dx, dy) - dr;
        if (dist > 0) System.out.println("не касаются");
        else System.out.println("касаются");
    }

    public static void main(String[] args) {
        Circle cira = new Circle(0, 0, 1);
        Circle ciro = new Circle(0, 0, 1);
        cira.two_circle(ciro);
        //cira.random_center();
        cira.line_circle();
        cira.distans(5, 5);
    }
}
