package Builder;

public class CarBuilder {
    private String brand;
    private String model;
    private int year;
    private int engine;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setEngine(int engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        return new Car(brand, model, year, engine);
    }
}
