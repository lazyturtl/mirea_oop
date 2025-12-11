public class TestDate {
    public static void main(String[] args) {
        java.util.Date[] arr = new java.util.Date[10];

        System.out.println(arr[0]);          // null
        // System.out.println(arr[0].toString());
        // ↑ Ошибка: NullPointerException, т.к. arr[0] == null
    }
}
