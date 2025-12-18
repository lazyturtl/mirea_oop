import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("\nСодержимое списка:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nРазмер списка: " + list.size());

        if (!list.isEmpty()) {
            System.out.println("Первый элемент: " + list.get(0));
            list.set(0, "Заменено!");
            System.out.println("После изменения первый элемент: " + list.get(0));
        }

        System.out.println("\nУдаление элемента по индексу 0...");
        if (!list.isEmpty()) list.remove(0);

        System.out.println("Итоговый список:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
