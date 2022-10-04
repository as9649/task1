public class Cart extends Light{
    protected double charging_time;

    public Cart() {
    }

    public Cart(int car_number, int age, int wheels, String steering, double pollutants, boolean engine, double charging_time) {
        super(car_number, age, wheels, steering, pollutants, engine);
        this.charging_time = charging_time;
    }

    public void setCharging_time(double charging_time) {
        this.charging_time = charging_time;
    }

    public double getCharging_time() {
        return charging_time;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Cart{" +
                "charging_time=" + charging_time +
                '}';
    }
}
