// MatrixTest.java
public class MatrixTest {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.set(0, 0, 1); m1.set(0, 1, 2);
        m1.set(1, 0, 3); m1.set(1, 1, 4);

        m2.set(0, 0, 5); m2.set(0, 1, 6);
        m2.set(1, 0, 7); m2.set(1, 1, 8);

        System.out.println("Сумма:");
        m1.add(m2).print();

        System.out.println("Умножение на 2:");
        m1.multiply(2).print();
    }
}
