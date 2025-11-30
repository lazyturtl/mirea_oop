// PhoneTest.java
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("12345", "Nokia", 0.3);
        Phone p2 = new Phone("67890", "Samsung");
        Phone p3 = new Phone();

        System.out.println(p1);
        System.out.println(p2);

        p1.receiveCall("Иван");
        p2.receiveCall("Мария", "11111");

        System.out.println("Номер p1: " + p1.getNumber());

        Phone.sendMessage("11111", "22222", "33333");
    }
}
