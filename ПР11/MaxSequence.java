import java.util.Scanner;

public class MaxSequence {

    static Scanner sc = new Scanner(System.in);

    public static int max() {
        int x = sc.nextInt();
        if (x == 0) return 0;
        return Math.max(x, max());
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
