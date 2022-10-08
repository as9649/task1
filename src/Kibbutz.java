import java.util.ArrayList;
import java.util.List;

public class Kibbutz {
    private Vehicles[] vehicles = new Vehicles[500];
    private int numOfVehicles;

    public Kibbutz(){
        numOfVehicles=0;
    }

    public void add_vehicles(Vehicles vehicle){
        vehicles[numOfVehicles]=vehicle;
        numOfVehicles++;
    }

    public ArrayList<Vehicles> getList(){
         ArrayList<Vehicles> myList=new ArrayList<Vehicles>();
         for (int i=0; i<numOfVehicles; i++){
             if (vehicles[i].getAge()>15 && vehicles[i].getSteering()=="wheel")
                myList.add(vehicles[i]);
         }
         return myList;
    }

    public int steering_wheel(){
        int sum=0;
        for (int i=0; i<numOfVehicles; i++){
            if (vehicles[i] instanceof Regular || vehicles[i] instanceof Light)
                if (vehicles[i].getSteering()=="wheel") sum++;
        }
        return sum;
    }
}
