import java.util.Scanner;

public class PrintOddSequence {

    static Scanner sc = new Scanner(System.in);

    public static void print() {
        int x = sc.nextInt();
        if (x == 0) return;
        if (x % 2 == 1) System.out.println(x);
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
