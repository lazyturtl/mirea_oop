public class Processor {
    private String model;
    private double clockSpeedGHz;

    public Processor(String model, double clockSpeedGHz) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + " " + clockSpeedGHz + "GHz";
    }
}