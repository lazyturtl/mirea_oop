// EmployerTest.java
public class EmployerTest {
    public static void main(String[] args) {
        Employer e1 = new Employer("Иван", "Иванов", 2000);
        Employer e2 = new Manager("Петр", "Петров", 2500, 10000);

        Employer[] arr = {e1, e2};
        for (Employer e : arr) {
            System.out.println(e);
        }
    }
}
