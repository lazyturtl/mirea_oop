public class Monitor {
    private double diagonalInches;
    private String resolution;

    public Monitor(double diagonalInches, String resolution) {
        this.diagonalInches = diagonalInches;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Монитор: " + diagonalInches + "\" " + resolution;
    }
}