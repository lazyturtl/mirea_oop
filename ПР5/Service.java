public class Service implements Priceable {
    private String serviceName;
    private double pricePerHour;
    private int hours;

    public Service(String serviceName, double pricePerHour, int hours) {
        this.serviceName = serviceName;
        this.pricePerHour = pricePerHour;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return pricePerHour * hours;
    }

    @Override
    public String toString() {
        return "Услуга '" + serviceName + "'";
    }
}