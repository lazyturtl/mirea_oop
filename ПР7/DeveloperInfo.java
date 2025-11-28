import java.util.Date;

public class DeveloperInfo {
    public static void main(String[] args) {
        String developer = "Иванов Иван";
        Date assigned = new Date(125, 9, 1, 10, 0); // пример даты получения (год от 1900)
        Date submitted = new Date(); // текущая дата и время

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + assigned);
        System.out.println("Дата сдачи задания: " + submitted);
    }
}