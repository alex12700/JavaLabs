package labs.example;

import static java.lang.Thread.sleep;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Отсчёт пошёл... ");
        for(int i = 5; i >= 0; i--){
            sleep(1000);
            System.out.println(i);
        }
        System.out.println("BTOOOOOOM");
        System.out.println("mother father");
    }
}
