import java.util.ArrayList;

public class Main {

    public static double sum_of_pollutants(Vehicles[] vehicles){
        double sum=0;
        for (int i=0; i<vehicles.length; i++){
            sum+=vehicles[i].exhaust();
        }
        return sum;
    }

    public static void getNoise(Vehicles[] vehicles){
        for (int i=0; i<vehicles.length; i++){
            if (vehicles[i] instanceof Regular) ((Regular) vehicles[i]).noise();
        }
    }

    public static int sum_of_passengers(Vehicles[] vehicles){
        int sum=0;
        for (int i=0; i<vehicles.length; i++)
            if(vehicles[i] instanceof Regular) sum+= ((Regular) vehicles[i]).getPassengers();
        return sum;
    }

    public static double maxChargingTime(Vehicles[] vehicles){
        double max=0;
        for (int i=0; i<vehicles.length; i++){
            if (vehicles[i] instanceof Cart) max=Math.max(max,((Cart) vehicles[i]).getCharging_time());
        }
        return max;
    }
}
