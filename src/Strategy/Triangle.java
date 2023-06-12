package Strategy;

public class Triangle implements Area {
    private double height;
    private double  width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return  height * width / 2;
    }
}
