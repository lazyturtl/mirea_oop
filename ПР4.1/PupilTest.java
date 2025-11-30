// PupilTest.java
public class PupilTest {
    public static void main(String[] args) {
        Pupil[] pupils = {
                new Schoolchild("Саша"),
                new Student("Иван"),
                new Schoolchild("Маша"),
                new Student("Оля")
        };

        for (Pupil p : pupils) {
            System.out.println(p);
        }

        System.out.println("\nТолько студенты:");
        for (Pupil p : pupils) {
            if (p instanceof Student) {
                System.out.println(p);
            }
        }

        System.out.println("\nТолько школьники:");
        for (Pupil p : pupils) {
            if (p instanceof Schoolchild) {
                System.out.println(p);
            }
        }
    }
}
