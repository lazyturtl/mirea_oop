import java.util.Scanner;

public class ShopManager {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Найти компьютер по бренду");
            System.out.println("3. Показать все компьютеры");
            System.out.println("4. Выход");
            System.out.print("Введите команду: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    addComputer(scanner, shop);
                    break;
                case "2":
                    findComputer(scanner, shop);
                    break;
                case "3":
                    shop.listComputers();
                    break;
                case "4":
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверная команда.");
            }
        } while (!command.equals("4"));

        scanner.close();
    }

    private static void addComputer(Scanner scanner, Shop shop) {
        try {
            System.out.print("Введите бренд (ASUS, HP, DELL, ACER, LENOVO, APPLE): ");
            ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Введите модель процессора: ");
            String procModel = scanner.nextLine();
            System.out.print("Введите частоту процессора (GHz): ");
            double procSpeed = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите объем памяти (GB): ");
            int memSize = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите тип памяти (e.g., DDR4): ");
            String memType = scanner.nextLine();

            System.out.print("Введите диагональ монитора (\"): ");
            double monDiag = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите разрешение монитора (e.g., 1920x1080): ");
            String monRes = scanner.nextLine();

            Computer computer = new Computer(
                    brand,
                    new Processor(procModel, procSpeed),
                    new Memory(memSize, memType),
                    new Monitor(monDiag, monRes)
            );
            shop.addComputer(computer);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода. Неверный бренд или неверный формат числа.");
        }
    }

    private static void findComputer(Scanner scanner, Shop shop) {
        try {
            System.out.print("Введите бренд для поиска: ");
            ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine().toUpperCase());
            Computer found = shop.findComputer(brand);
            if (found != null) {
                System.out.println("Найден компьютер:");
                System.out.println(found);
            } else {
                System.out.println("Компьютер бренда " + brand + " не найден.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода. Такого бренда не существует.");
        }
    }
}