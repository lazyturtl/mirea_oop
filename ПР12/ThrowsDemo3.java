import java.util.*;

public class ThrowsDemo3 {

    public void getKey() {
        Scanner sc = new Scanner(System.in);
        try {
            String key = sc.next();
            printDetails(key);

        } catch (Exception e) {
            System.out.println("Handled in getKey: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String msg = getDetails(key);
        System.out.println(msg);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");

        return "data for " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo3().getKey();
    }
}
