// ShopApp.java
import java.util.*;

public class ShopApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<Catalog, List<String>> products = new HashMap<>();
    private static final List<String> cart = new ArrayList<>();

    static {
        products.put(Catalog.ELECTRONICS, Arrays.asList("Телефон", "Ноутбук", "Наушники"));
        products.put(Catalog.CLOTHES, Arrays.asList("Футболка", "Куртка", "Джинсы"));
        products.put(Catalog.BOOKS, Arrays.asList("Роман", "Учебник", "Комикс"));
    }

    public static void main(String[] args) {
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();

        if (!authenticate(login, password)) {
            System.out.println("Неверный логин или пароль!");
            return;
        }

        System.out.println("Добро пожаловать, " + login);

        boolean running = true;
        while (running) {
            System.out.println("\n1. Каталоги\n2. Корзина\n3. Купить\n4. Выход");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> showCatalogs();
                case 2 -> showCart();
                case 3 -> buy();
                case 4 -> running = false;
            }
        }
    }

    private static boolean authenticate(String login, String password) {
        return login.equals("user") && password.equals("1234");
    }

    private static void showCatalogs() {
        System.out.println("Выберите каталог:");
        int i = 1;
        for (Catalog c : Catalog.values()) {
            System.out.println(i++ + ". " + c);
        }
        int choice = sc.nextInt();
        sc.nextLine();
        Catalog selected = Catalog.values()[choice - 1];
        List<String> items = products.get(selected);

        System.out.println("Товары:");
        for (int j = 0; j < items.size(); j++) {
            System.out.println((j + 1) + ". " + items.get(j));
        }
        System.out.print("Выберите товар (0 - назад): ");
        int prodChoice = sc.nextInt();
        sc.nextLine();
        if (prodChoice > 0 && prodChoice <= items.size()) {
            cart.add(items.get(prodChoice - 1));
            System.out.println("Добавлено в корзину!");
        }
    }

    private static void showCart() {
        System.out.println("Корзина: " + cart);
    }

    private static void buy() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println("Вы купили: " + cart);
            cart.clear();
        }
    }
}
