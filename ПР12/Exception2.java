import java.util.*;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Not an integer");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");

        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}
