import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int n = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("=== Тест добавления ===");
        measureAdd(arrayList, n);
        measureAdd(linkedList, n);

        System.out.println("\n=== Тест поиска ===");
        measureSearch(arrayList, n);
        measureSearch(linkedList, n);

        System.out.println("\n=== Тест удаления ===");
        measureRemove(arrayList, n);
        measureRemove(linkedList, n);
    }

    private static void measureAdd(List<Integer> list, int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) list.add(i);
        long end = System.nanoTime();
        System.out.println(list.getClass().getSimpleName() + " add: " + (end - start) / 1_000_000 + " ms");
    }

    private static void measureSearch(List<Integer> list, int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) list.contains(n / 2);
        long end = System.nanoTime();
        System.out.println(list.getClass().getSimpleName() + " search: " + (end - start) / 1_000_000 + " ms");
    }

    private static void measureRemove(List<Integer> list, int n) {
        long start = System.nanoTime();
        list.clear();
        long end = System.nanoTime();
        System.out.println(list.getClass().getSimpleName() + " remove: " + (end - start) / 1_000_000 + " ms");
    }
}