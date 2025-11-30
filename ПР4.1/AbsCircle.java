// AbsCircle.java
public class AbsCircle extends AbsShape {
    private double radius;

    public AbsCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг радиус=" + radius + ", " + super.toString();
    }
}
