public class Regular extends Vehicles{
    protected int passengers;

    public Regular(int car_number, int age, int wheels, String steering, double pollutants,int seats, int passengers) {
        super(car_number, age, wheels, steering, pollutants, seats);
        this.passengers = passengers;
    }

    public void setPassengers(int passengers) { this.passengers = passengers; }
    public int getPassengers() { return passengers; }

    @Override
    public String toString() {
        return "Regular{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", passengers=" + passengers +
                '}';
    }

    @Override
    public double exhaust() { return super.exhaust()*24; }

    public void noise() { System.out.println("Beep Beep!"); }

    public int hitchhikers() { return seats-passengers-1; }
}
