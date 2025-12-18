public class StudentGPA {
    private String name;
    private double gpa;

    public StudentGPA(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA=" + gpa + ")";
    }
}
