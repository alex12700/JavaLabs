package labs.lab7_2.Task2;

/**
 * Created by Алексаелп on 23.02.2017.
 */
public class Truck implements CargoAuto, PassangersAuto{
    public void passengerTransport(int people){
        if (people < 0 ) return;
        if (people < 2) System.out.println(people + " могу увезти");
        else System.out.println("слишком много пасажиров");
    };
    public void shipping(int weight){
        if (weight < 0) return;
        if (weight > 10000) System.out.println("слишком тяжелый груз");
        else System.out.printf("увезу");
    };
}
