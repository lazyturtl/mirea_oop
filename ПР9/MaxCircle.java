public class MaxCircle {
    public static void main(String[] args) {
        Circle[] arr = new Circle[10];

        for (int i = 0; i < 10; i++)
            arr[i] = new Circle(Math.random() * 10);

        Circle max = arr[0];
        for (Circle c : arr)
            if (c.getArea() > max.getArea())
                max = c;

        System.out.println("Максимальная площадь = " + max.getArea());
    }
}
