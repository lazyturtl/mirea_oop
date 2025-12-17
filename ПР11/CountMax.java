import java.util.Scanner;

public class CountMax {

    static Scanner sc = new Scanner(System.in);

    public static int[] solve() {
        int x = sc.nextInt();
        if (x == 0) return new int[]{0, 0};

        int[] r = solve();

        if (x > r[0]) return new int[]{x, 1};
        if (x == r[0]) return new int[]{r[0], r[1] + 1};
        return r;
    }

    public static void main(String[] args) {
        int[] r = solve();
        System.out.println("Max = " + r[0] + ", count = " + r[1]);
    }
}
