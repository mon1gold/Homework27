package Builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int engine;


    public Car(String brand, String model, int year, int engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getEngine() {
        return engine;
    }
}
