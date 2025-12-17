public class DigitsLeft {

    public static void print(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        print(12345);
    }
}
