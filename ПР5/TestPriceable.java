public class TestPriceable {
    public static void main(String[] args) {
        Priceable laptop = new Product("Ноутбук", 1200.50);
        Priceable consultation = new Service("Консультация", 50.0, 3);

        System.out.println("Цена за " + laptop + ": " + laptop.getPrice());
        System.out.println("Цена за " + consultation + ": " + consultation.getPrice());
    }
}