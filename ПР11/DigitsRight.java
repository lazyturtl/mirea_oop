public class DigitsRight {

    public static void print(int n) {
        System.out.println(n % 10);
        if (n < 10) return;
        print(n / 10);
    }

    public static void main(String[] args) {
        print(12345);
    }
}
