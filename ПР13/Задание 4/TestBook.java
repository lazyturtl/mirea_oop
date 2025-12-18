public class TestBook {
    public static void main(String[] args) {

        Book[] arr = {
                new Book("War and Peace", 1867),
                new Book("Java Programming", 2020),
                new Book("Harry Potter", 1997)
        };

        InsertionSort.insertionSort(arr);

        System.out.println("Books sorted by year:");
        for (Book b : arr) System.out.println(b);
    }
}
