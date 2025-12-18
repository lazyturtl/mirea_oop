public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Привет");
        list.add("Мир");
        list.add("Java");

        System.out.println("Элементы списка:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("\nИзменяем элемент под индексом 1...");
        list.set(1, "ООАП");

        System.out.println("После изменения:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("\nУдаляем элемент под индексом 0...");
        list.remove(0);

        System.out.println("Итоговый список:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
