public class Book implements Comparable<Book> {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.year, o.year); // сортировка по году
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}
