public class Journal implements Printable {
    private String name;public Journal(String n){name=n;}public void print(){System.out.println("Journal: "+name);}public String getName(){return name;}
}