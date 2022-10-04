public class Light extends Vehicles{
    protected boolean engine;

    public Light(){}

    public Light(int car_number, int age, int wheels, String steering, double pollutants, boolean engine) {
        super(car_number, age, wheels, steering, pollutants);
        this.engine = engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isEngine() {
        return engine;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Light{" +
                "engine=" + engine +
                '}';


    }
}
