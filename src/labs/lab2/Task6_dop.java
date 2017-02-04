package labs.lab2;

public class Task6_dop {

    public int min(int a, int b, int c, int d){
        Task6_dop variable = new Task6_dop();
        int minimum2 = variable.min(a , b);
        int minimum3 = variable.min(minimum2 , c);
        int result = variable.min(minimum3 , d);
        return result;
    }

    public int min(int a, int b){
        if (a > b) {
            return b;
        }else return a;
    }
}
