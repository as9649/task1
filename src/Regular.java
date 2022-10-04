public class Regular extends Vehicles{
    protected int passengers;

    public Regular(int car_number, int age, int wheels, String steering, double pollutants, int passengers) {
        super(car_number, age, wheels, steering, pollutants);
        this.passengers = passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Regular{" +
                "passengers=" + passengers +
                '}';
    }
}
