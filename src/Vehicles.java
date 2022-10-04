public class Vehicles {
    protected int car_number, age, wheels;
    protected String steering;
    protected double pollutants;

    public Vehicles(){}

    public Vehicles(int car_number, int age, int wheels, String steering, double pollutants) {
        this.car_number=car_number;
        this.age=age;
        this.wheels=wheels;
        this.steering=steering;
        this.pollutants=pollutants;
    }

    public void setCar_number(int car_number) {
        this.car_number = car_number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setPollutants(double pollutants) {
        this.pollutants = pollutants;
    }

    public int getCar_number() {
        return car_number;
    }

    public int getAge() {
        return age;
    }

    public int getWheels() {
        return wheels;
    }

    public String getSteering() {
        return steering;
    }

    public double getPollutants() {
        return pollutants;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "car_number=" + car_number +
                ", age=" + age +
                ", wheels=" + wheels +
                ", steering='" + steering + '\'' +
                ", pollutants=" + pollutants +
                '}';
    }
}
