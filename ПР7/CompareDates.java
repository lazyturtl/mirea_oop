import java.util.*;
import java.text.*;

public class CompareDates {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату (в формате yyyy-MM-dd): ");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date userDate = sdf.parse(input);
        Date now = new Date();

        System.out.println("Текущая дата: " + sdf.format(now));
        if (userDate.before(now))
            System.out.println("Введенная дата раньше текущей.");
        else if (userDate.after(now))
            System.out.println("Введенная дата позже текущей.");
        else
            System.out.println("Даты совпадают.");
    }
}