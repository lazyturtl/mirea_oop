public class Book implements Printable {
    private String title;private String author;
    public Book(String t,String a){title=t;author=a;}
    public void print(){System.out.println("Book: "+title+" by "+author);}public String getTitle(){return title;}
    public static void printBooks(Printable[]arr){for(Printable p:arr)if(p instanceof Book b)System.out.println(b.getTitle());}
}