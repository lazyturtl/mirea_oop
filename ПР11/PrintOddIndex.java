import java.util.Scanner;

public class PrintOddIndex {

    static Scanner sc = new Scanner(System.in);

    public static void print(int index) {
        int x = sc.nextInt();
        if (x == 0) return;

        if (index % 2 == 1)
            System.out.println(x);

        print(index + 1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
