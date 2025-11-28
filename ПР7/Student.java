import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(int style) {
        DateFormat df = DateFormat.getDateInstance(style);
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " + new SimpleDateFormat("dd.MM.yyyy").format(birthDate);
    }
}