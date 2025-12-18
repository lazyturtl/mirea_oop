public class TestGPA {
    public static void main(String[] args) {

        StudentGPA[] arr = {
                new StudentGPA("Ivan", 3.9),
                new StudentGPA("Petr", 4.8),
                new StudentGPA("Anna", 4.1),
                new StudentGPA("Olga", 5.0)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted by GPA (descending):");
        for (StudentGPA s : arr) System.out.println(s);
    }
}
