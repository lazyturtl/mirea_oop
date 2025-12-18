import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число #" + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nСписок чисел:");
        for (int x : numbers) {
            System.out.println(x);
        }

        System.out.println("\nДобавляем число в начало и конец...");
        numbers.addFirst(111);
        numbers.addLast(999);

        System.out.println("После добавления:");
        for (int x : numbers) {
            System.out.println(x);
        }

        System.out.println("\nУдаляем первый и последний элементы...");
        if (!numbers.isEmpty()) numbers.removeFirst();
        if (!numbers.isEmpty()) numbers.removeLast();

        System.out.println("Итоговый список:");
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
