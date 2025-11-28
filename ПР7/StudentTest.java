import java.text.*;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Student s = new Student("Алексей Петров", sdf.parse("12.03.2003"));

        System.out.println(s);
        System.out.println("Короткий формат: " + s.formatBirthDate(DateFormat.SHORT));
        System.out.println("Средний формат: " + s.formatBirthDate(DateFormat.MEDIUM));
        System.out.println("Полный формат: " + s.formatBirthDate(DateFormat.FULL));
    }
}