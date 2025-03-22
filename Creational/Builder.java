class Car {
    private String engine;
    private int wheels;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
    }

    public void showDetails() {
        System.out.println("Car Engine: " + engine + ", Wheels: " + wheels);
    }

    static class CarBuilder {
        private String engine;
        private int wheels;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

public class Builder {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().setEngine("V8").setWheels(4).build();
        car.showDetails();
    }
}
