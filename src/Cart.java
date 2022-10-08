public class Cart extends Light{
    protected double charging_time;

    public Cart() {
    }

    public Cart(int car_number, int age, int wheels, String steering, double pollutants, int seats, boolean engine, double charging_time) {
        super(car_number, age, wheels, steering, pollutants, seats, engine);
        this.charging_time = charging_time;
    }

    public void setCharging_time(double charging_time) { this.charging_time = charging_time; }

    public double getCharging_time() { return charging_time; }

    @Override
    public String toString() {
        return "Cart{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", engine=" + engine +
                ", charging time= " + charging_time +
                '}';
    }

    @Override
    public double exhaust(){
        if (engine) return super.exhaust()*24;
        return 0;
    }

    public int hitchhikers() { return seats-1; }
}
