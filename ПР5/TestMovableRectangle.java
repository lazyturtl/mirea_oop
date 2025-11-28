public class TestMovableRectangle {
    public static void main(String[] args) {
        Movable rect = new MovableRectangle(0, 5, 5, 0, 2, 2);
        System.out.println("Initial position:");
        System.out.println(rect);

        rect.moveDown();
        rect.moveRight();

        System.out.println("\nPosition after moving down and right:");
        System.out.println(rect);
    }
}