import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер " + computer.getBrand() + " добавлен в магазин.");
    }

    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер " + computer.getBrand() + " удален.");
        } else {
            System.out.println("Такой компьютер не найден.");
        }
    }

    public Computer findComputer(ComputerBrand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }

    public void listComputers() {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров.");
            return;
        }
        System.out.println("----- Каталог компьютеров -----");
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("-----------------------------");
    }
}