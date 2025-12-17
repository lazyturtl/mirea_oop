import java.util.*;

public class ThrowsDemo4 {

    public void getKey() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                String key = sc.next();
                printDetails(key);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Try again:");
            }
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
        new ThrowsDemo4().getKey();
    }
}
