public class NoDoubleZero {

    public static int count(int a, int b) {
        if (a < 0 || b < 0) return 0;
        if (a == 0) return 1;
        if (b == 0) return 1;

        return count(a - 1, b) + count(a, b - 1) - count(a - 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(count(2, 3));
    }
}
