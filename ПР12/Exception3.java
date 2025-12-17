import java.util.*;

public class Exception3 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter int: ");
            String s = sc.next();
            int i = Integer.parseInt(s);
            System.out.println(2 / i);

        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }

    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }
}
