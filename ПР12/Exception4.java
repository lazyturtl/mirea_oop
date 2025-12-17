import java.util.*;

public class Exception4 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter int: ");
            int i = Integer.parseInt(sc.next());
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Not a number");

        } catch (ArithmeticException e) {
            System.out.println("Zero division");

        } finally {
            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {
        new Exception4().exceptionDemo();
    }
}

