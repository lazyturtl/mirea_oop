public class Test {
    int count;

    public static void main(String[] args) {
        System.out.println("Факториал 5 = " + factorial(5));
        Test t = new Test();
        System.out.println("count = " + t.getCount());
    }

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) r *= i;
        return r;
    }
}
