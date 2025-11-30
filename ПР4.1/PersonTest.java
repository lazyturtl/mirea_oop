// PersonTest.java
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Иван Иванов", 25);

        p1.talk();
        p2.move();
    }
}
