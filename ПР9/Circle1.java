public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
