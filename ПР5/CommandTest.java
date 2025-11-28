public class CommandTest {
    public static void main(String[] args) {
        UndoableStringBuilder usb = new UndoableStringBuilder();

        usb.append("Hello, ");
        System.out.println(usb); // Hello,

        usb.append("World!");
        System.out.println(usb); // Hello, World!

        usb.undo();
        System.out.println(usb); // Hello,

        usb.undo();
        System.out.println(usb); //
    }
}