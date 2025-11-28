public class TemperatureTest {
    public static void main(String[] args) {
        double tempCelsius = 25.0;

        System.out.println("Температура по Цельсию: " + tempCelsius + "°C");

        Convertable toKelvin = new KelvinConverter();
        System.out.println("Температура по Кельвину: " + toKelvin.convert(tempCelsius) + "K");

        Convertable toFahrenheit = new FahrenheitConverter();
        System.out.println("Температура по Фаренгейту: " + toFahrenheit.convert(tempCelsius) + "°F");
    }
}