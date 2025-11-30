// AbsShape.java
public abstract class AbsShape {
    protected String color;
    protected boolean filled;

    public AbsShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Фигура цвета " + color + " (закрашена=" + filled + ")";
    }
}
