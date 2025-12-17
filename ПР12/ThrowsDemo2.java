public class ThrowsDemo2 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);

        } catch (NullPointerException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null)
            throw new NullPointerException("null key in getDetails");

        return "data for " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo2().printMessage(null);
        new ThrowsDemo2().printMessage("A");
    }
}
