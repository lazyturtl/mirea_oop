// Employer.java
public class Employer {
    protected String firstName, lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12; // годовой доход
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " доход=" + getIncome();
    }
}
