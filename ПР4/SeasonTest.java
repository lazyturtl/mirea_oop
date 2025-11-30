public class SeasonTest {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemp());
        System.out.println("Описание: " + favorite.getDescription());

        printMessage(favorite);

        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + " | Средняя температура: " + s.getAverageTemp()
                    + " | " + s.getDescription());
        }
    }

    static void printMessage(Season season) {
        switch (season) {
            case SUMMER -> System.out.println("Я люблю лето!");
            case WINTER -> System.out.println("Я люблю зиму!");
            case SPRING -> System.out.println("Я люблю весну!");
            case AUTUMN -> System.out.println("Я люблю осень!");
        }
    }
}