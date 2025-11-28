import java.util.*;

public class DateCalendarInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = sc.nextInt() - 1;
        System.out.print("Введите число: ");
        int day = sc.nextInt();
        System.out.print("Введите часы: ");
        int hour = sc.nextInt();
        System.out.print("Введите минуты: ");
        int minute = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute);

        System.out.println("Созданная дата (Calendar): " + cal.getTime());

        Date date = cal.getTime();
        System.out.println("Созданная дата (Date): " + date);
    }
}