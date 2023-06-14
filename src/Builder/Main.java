package Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setYear(2022)
                .setEngine(300)
                .build();

        // Виведення інформації про автомобіль
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Horsepower: " + car.getEngine());
    }
}
