import java.util.Scanner;

public class CountOnes {

    static Scanner sc = new Scanner(System.in);

    public static int count() {
        int x = sc.nextInt();
        if (x == 0) {
            int y = sc.nextInt();
            if (y == 0) return 0;
            return (y == 1 ? 1 : 0) + count();
        }
        return (x == 1 ? 1 : 0) + count();
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
