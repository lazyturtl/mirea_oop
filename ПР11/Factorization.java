public class Factorization {

    public static void factor(int n, int d) {
        if (d * d > n) {
            System.out.print(n);
            return;
        }
        if (n % d == 0) {
            System.out.print(d + " ");
            factor(n / d, d);
        } else {
            factor(n, d + 1);
        }
    }

    public static void main(String[] args) {
        factor(360, 2);
    }
}
