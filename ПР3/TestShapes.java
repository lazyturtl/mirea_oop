// TestShapes.java
public class TestShapes {
    public static void main(String[] args) {
        // Upcast Circle to Shape
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);                    // вызов toString() у Circle (полиморфизм)
        System.out.println("Area: " + s1.getArea());          // Circle.getArea()
        System.out.println("Perimeter: " + s1.getPerimeter());// Circle.getPerimeter()
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        // System.out.println(s1.getRadius()); // <-- ОШИБКА: метод getRadius не объявлен в Shape

        // Downcast back to Circle
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());

        // Нельзя создать абстрактный Shape
        // Shape s2 = new Shape(); // <-- ОШИБКА компиляции: Shape абстрактный

        // Rectangle example
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println("Color: " + s3.getColor());
        // System.out.println(s3.getLength()); // <-- ОШИБКА: getLength() нет в Shape (не объявлен)

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println("Length: " + r1.getLength());

        // Square example
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println("Area: " + s4.getArea());
        System.out.println("Color: " + s4.getColor());
        // System.out.println(s4.getSide()); // <-- ОШИБКА: getSide() нет в Shape (не объявлен)

        // Upcast to Rectangle (valid, Square is subclass of Rectangle)
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        // System.out.println("Side via Rectangle reference: " + r2.getSide()); // <-- ошибка: getSide() нет в Rectangle (не объявлен)

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("Side: " + sq1.getSide());
    }
}
// Вызовы методов у переменной типа Shape будут доступны только те, что объявлены в Shape. Если нужен специфичный метод (getRadius, getSide, getLength) — сначала выполнить downcast.