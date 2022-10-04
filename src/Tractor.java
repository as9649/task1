public class Tractor extends Heavy{
    protected String type;

    public Tractor(){}

    public Tractor(int car_number, int age, int wheels, String steering, double pollutants, int trailers, String type) {
        super(car_number, age, wheels, steering, pollutants, trailers);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Tractor{" +
                "type='" + type + '\'' +
                '}';
    }
}
