// AbsShapeTest.java
public class AbsShapeTest {
    public static void main(String[] args) {
        AbsShape s1 = new AbsCircle(5, "красный", true);
        AbsShape s2 = new AbsRectangle(4, 6, "синий", false);
        AbsShape s3 = new AbsSquare(3, "зелёный", true);

        AbsShape[] arr = {s1, s2, s3};
        for (AbsShape s : arr) {
            System.out.println(s);
            System.out.println("Площадь: " + s.getArea());
            System.out.println("Периметр: " + s.getPerimeter());
            System.out.println();
        }
    }
}
