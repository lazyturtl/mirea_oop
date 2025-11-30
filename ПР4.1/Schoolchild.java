// Schoolchild.java
public class Schoolchild extends Pupil {
    public Schoolchild(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Школьник: " + name;
    }
}
