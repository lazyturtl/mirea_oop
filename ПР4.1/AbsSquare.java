// AbsSquare.java
public class AbsSquare extends AbsRectangle {
    public AbsSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Квадрат, " + super.toString();
    }
}
