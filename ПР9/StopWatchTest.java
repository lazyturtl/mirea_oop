import java.util.Random;

public class StopWatchTest {
    public static void main(String[] args) {
        int n = 50000;
        int[] arr = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++)
            arr[i] = r.nextInt();

        StopWatch sw = new StopWatch();
        sw.start();

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min]) min = j;

            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }

        sw.stop();
        System.out.println("Время выполнения сортировки = " + sw.getElapsedTime() + " ms");
    }
}
