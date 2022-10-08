abstract class Heavy extends Vehicles{
    protected int Trailers;

    public Heavy(){}
    public Heavy(int car_number, int age, int wheels, String steering, double pollutants, int seats, int trailers) {
        super(car_number, age, wheels, steering, pollutants, seats);
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
        return "Heavy{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", Trailers=" + Trailers +
                '}';
    }

    @Override
    public double exhaust() { return super.exhaust()*24+(500*this.Trailers); }
}

