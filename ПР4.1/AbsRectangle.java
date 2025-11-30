// AbsRectangle.java
public class AbsRectangle extends AbsShape {
    private double width, length;

    public AbsRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Прямоугольник " + width + "x" + length + ", " + super.toString();
    }
}
