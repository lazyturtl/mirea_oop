// ReaderTest.java
public class ReaderTest {
    public static void main(String[] args) {
        Reader r = new Reader("Петров В.В.", "123", "Физика", "01.01.2000", "555-55-55");

        r.takeBook(3);
        r.takeBook("Приключения", "Словарь", "Энциклопедия");
        r.takeBook(new Book("Приключения", "Иванов"), new Book("Словарь", "Сидоров"));

        r.returnBook(2);
        r.returnBook("Роман", "Учебник");
    }
}
