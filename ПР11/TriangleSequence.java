public class TriangleSequence {
    public static void main(String[] args) {
        int n = 15; // пример

        int count = 0;
        for (int k = 1; count < n; k++) {
            for (int j = 0; j < k && count < n; j++) {
                System.out.print(k + " ");
                count++;
            }
        }
    }
}
