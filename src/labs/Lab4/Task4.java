package labs.Lab4;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Алексаелп on 05.02.2017.
 */
public class Task4 {
    public static void main(String[] args) {
//        System.out.println(fib(50));
//        Timer timer = new Timer();
//        mMyTimerTask = new MyTimerTask();
//        timer.schedule(mMyTimerTask, 1000);
//        //timer.schedule(fib(1), 1000);
        Timer time = new Timer();
        Timer timer = new Timer();

//        time.schedule(new TimerTask() {
//            int i = 0;
//            @Override
//            public void run() {
//                if (i>=2){
//                    System.out.println("timer was dead");
//                    time.cancel();
//                    return;
//                }
//                System.out.println("4 sekonds");
//                i += 1;
//            }
//        },0, 4000);

        //////////////////////////////////////////////////////



//        time.schedule(new TimerTask() {
//            int n = 1;
//            @Override
//            public void run() {
//                System.out.println("start " + n);
//                if (n==55){
//                    System.out.println("FIB DEAD");
//                    System.out.println("WE GOT IT: " + n);
//                    time.cancel();
//                    return;
//                }
//                System.out.println(fib(n));
//                n++;
//            }
//        },1, 1);

        boolean timeOfPeriod = false;
        timer.schedule(new TimerTask() {
            int i = 0;
            @Override
            public void run() {
                if (i == 1) {
                    System.out.println("Прошло 60 секунд");
                    System.out.println("Прошло 60 секунд");
                    System.out.println("Прошло 60 секунд");
                    //я не понимаю как настроить общение этой переменной
                    //с более высокими переменными
                    //timeOfPeriod = true;
                    timer.cancel();
                    return;
                } else i++;
            }
        }, 1, 600);

        int i;
        for (i = 1; i < 50; i++) {
            System.out.println("start " + i);
            System.out.println(fib(i));
            if (timeOfPeriod) break;
        }
        System.out.println("FIB DEAD");
        System.out.println("WE GOT IT: " + i);
    }


    static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
