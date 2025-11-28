public class TestNameable {
    public static void main(String[] args) {
        Nameable earth = new Planet("Земля");
        Nameable tesla = new Car("Tesla", "Model S");
        Nameable lion = new Animal("Лев");

        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + tesla.getName());
        System.out.println("Имя животного: " + lion.getName());
    }
}