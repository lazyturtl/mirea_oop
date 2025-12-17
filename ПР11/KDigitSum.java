public class KDigitSum {

    public static int count(int k, int sum) {
        if (k == 1) return (sum >= 1 && sum <= 9) ? 1 : 0;

        int res = 0;
        for (int d = 0; d <= 9; d++) {
            if (sum - d >= 0)
                res += count(k - 1, sum - d);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(count(3, 6)); // пример
    }
}
