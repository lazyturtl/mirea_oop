public class C {
    Circle c = new Circle();

    public static void main(String[] args) {
        new C().method1();
    }

    public void method1() {
        method2();
    }

    public void method2() {
        System.out.println("Площадь круга = " + c.getArea());
    }
}
