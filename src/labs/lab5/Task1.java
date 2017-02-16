package labs.lab5;

import javafx.scene.shape.Circle;

import java.util.Scanner;

/**
 * Created by Алексаелп on 12.02.2017.
 */
public class Task1 {
    int x;
    int y;
    int r;

    void line_circle() {
        System.out.println(Math.PI * r * 2);
    }

    void random_center() {
        x = (int) (Math.random() * 202 - 101);
        y = (int) (Math.random() * 202 - 101);
        System.out.println(x + "   " + y);
    }

    public Task1() {
        Scanner dan = new Scanner(System.in);
        System.out.println("Введите x");
        x = dan.nextInt();
        System.out.println("Введите y");
        y = dan.nextInt();
        System.out.println("Введите r");
        r = dan.nextInt();
    }

    public Task1(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void distanc(int x2, int y2) {
        double dx = x - x2;
        double dy = y - y2;
        System.out.println("расстояние = " + Math.hypot(dx, dy));
    }

    void two_circle(Task1 cir) {
        double dx = this.x - cir.x;
        double dy = this.y - cir.y;
        double dr = this.r + cir.r;
        double dist = Math.hypot(dx, dy) - dr;
        if (dist > 0) System.out.println("не касаются");
        else System.out.println("касаются");
    }

    public static void main(String[] args) {
        Task1 cira = new Task1(0, 0, 1);
        Task1 ciro = new Task1(0, 0, 1);
        cira.two_circle(ciro);
        //cira.random_center();
        cira.line_circle();
        cira.distanc(5 ,5);
    }
}
