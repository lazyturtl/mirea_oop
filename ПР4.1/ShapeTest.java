// ShapeTest.java
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Square(3);

        Shape[] shapes = {s1, s2, s3};
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Тип: " + s.getType());
            System.out.println("Площадь: " + s.getArea());
            System.out.println("Периметр: " + s.getPerimeter());
            System.out.println();
        }
    }
}
