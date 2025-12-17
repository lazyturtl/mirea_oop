public class PrintAtoB {

    public static void print(int a, int b) {
        System.out.println(a);
        if (a == b) return;
        print(a < b ? a + 1 : a - 1, b);
    }

    public static void main(String[] args) {
        print(3, 10);
        print(10, 3);
    }
}
