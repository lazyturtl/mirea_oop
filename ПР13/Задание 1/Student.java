public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.iDNumber, o.iDNumber);
    }

    @Override
    public String toString() {
        return name + " (ID=" + iDNumber + ")";
    }
}
