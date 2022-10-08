abstract class Light extends Vehicles{
    protected boolean engine;

    public Light(){}
    public Light(int car_number, int age, int wheels, String steering, double pollutants, int seats, boolean engine) {
        super(car_number, age, wheels, steering, pollutants, seats);
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
        return "Light{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", engine=" + engine +
                '}';
    }
}
