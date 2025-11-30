// Pupil.java
public class Pupil {
    protected String name;

    public Pupil(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Учащийся: " + name;
    }
}
