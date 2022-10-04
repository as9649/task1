public class Heavy extends Vehicles{
    protected int Trailers;

    public Heavy(){}

    public Heavy(int car_number, int age, int wheels, String steering, double pollutants, int trailers) {
        super(car_number, age, wheels, steering, pollutants);
        Trailers = trailers;
    }

    public void setTrailers(int trailers) {
        Trailers = trailers;
    }

    public int getTrailers() {
        return Trailers;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Heavy{" +
                "Trailers=" + Trailers +
                '}';
    }
}
