public class Truck extends Heavy{
    protected int max_loading_weight;

    public Truck(){}

    public Truck(int car_number, int age, int wheels, String steering, double pollutants, int seats, int trailers, int max_loading_weight) {
        super(car_number, age, wheels, steering, pollutants, seats, trailers);
        this.max_loading_weight = max_loading_weight;
    }

    public void setMax_loading_weight(int max_loading_weight) {
        this.max_loading_weight = max_loading_weight;
    }

    public int getMax_loading_weight() {
        return max_loading_weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", Trailers=" + Trailers +
                ", max_loading_weight=" + max_loading_weight +
                '}';
    }
    @Override
    public double exhaust() { return super.exhaust()*1.5; }
}
