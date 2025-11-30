// ComputerTest.java
public class ComputerTest {
    public static void main(String[] args) {
        Computer comp = new Computer(
                Brand.ASUS,
                new Processor("Intel i7", 3.5),
                new Memory(16),
                new Monitor(24)
        );

        System.out.println(comp);
    }
}
