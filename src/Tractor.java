public class Tractor extends Heavy{
    protected String type;

    public Tractor(){}
    public Tractor(int car_number, int age, int wheels, String steering, double pollutants, int seats, int trailers, String type) {
        super(car_number, age, wheels, steering, pollutants, seats, trailers);
        this.type = type;
    }

    public void setType(String type) { this.type = type; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Tractor{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", Trailers=" + Trailers +
                ", type='" + type +
                '}';
    }
}
