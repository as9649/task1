public class Bicycle extends Light{
    protected boolean basket;

    public Bicycle() {
    }

    public Bicycle(int car_number, int age, int wheels, String steering, double pollutants, int seats, boolean engine, boolean basket) {
        super(car_number, age, wheels, steering, pollutants, seats, engine);
        this.basket = basket;
    }

    public void setBasket(boolean basket) { this.basket = basket; }
    public boolean getBasket() { return basket; }

    @Override
    public String toString() {
        return "Bicycle{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering +
                ", pollutants=" + pollutants +
                ", seats=" + seats +
                ", engine=" + engine +
                ", basket=" + basket +
                '}';
    }
}
