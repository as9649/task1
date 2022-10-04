public class Bicycle extends Light{
    protected boolean basket;

    public Bicycle() {
    }

    public Bicycle(int car_number, int age, int wheels, String steering, double pollutants, boolean engine, boolean basket) {
        super(car_number, age, wheels, steering, pollutants, engine);
        this.basket = basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    public boolean isBasket() {
        return basket;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Bicycle{" +
                "basket=" + basket +
                '}';
    }
}
