package labs.lab7_2.Task2;

/**
 * Created by Алексаелп on 23.02.2017.
 */
public class Pickup implements PassangersAuto, CargoAuto {
    public void passengerTransport(int people){
        if (people < 0 ) return;
        if (people < 4) System.out.println(people + " могу увезти");
        else System.out.println("слишком много пасажиров");
    };
    public void shipping(int weight){
        if (weight < 0) return;
        if (weight > 2500) System.out.println("слишком тяжелый груз");
        else System.out.printf("увезу");
    };
}
