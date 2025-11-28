public class PrintableTest {
    public static void main(String[]a){Printable[]arr={new Book("War","Tolstoy"),new Journal("Nature")};for(Printable p:arr)p.print();Book.printBooks(arr);Magazine.printMagazines(arr);}
}