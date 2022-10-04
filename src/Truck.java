public class Truck extends Heavy{
    protected int max_loading_weight;

    public Truck(){}

    public Truck(int car_number, int age, int wheels, String steering, double pollutants, int trailers, int max_loading_weight) {
        super(car_number, age, wheels, steering, pollutants, trailers);
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
        System.out.println(super.toString());
        return "Truck{" +
                "max_loading_weight=" + max_loading_weight +
                '}';
    }
}
