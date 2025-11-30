// Reader.java
public class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String... books) {
        System.out.println(fullName + " взял книги: " + String.join(", ", books));
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book b : books) {
            System.out.print(b + "; ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(fullName + " вернул книги: " + String.join(", ", books));
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book b : books) {
            System.out.print(b + "; ");
        }
        System.out.println();
    }
}
