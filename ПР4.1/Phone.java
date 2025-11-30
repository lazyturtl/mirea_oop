// Phone.java
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model); // вызов конструктора с 2 параметрами
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public static void sendMessage(String... numbers) {
        System.out.println("Отправка сообщений на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Телефон: " + number + ", " + model + ", " + weight + " кг";
    }
}
