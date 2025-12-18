public class TestStudents {
    public static void main(String[] args) {

        Student[] arr = {
                new Student("Ivan", 32),
                new Student("Petr", 11),
                new Student("Olga", 55),
                new Student("Anna", 7)
        };

        System.out.println("Before sorting:");
        for (Student s : arr) System.out.println(s);

        InsertionSort.insertionSort(arr);

        System.out.println("\nAfter sorting by ID (insertion sort):");
        for (Student s : arr) System.out.println(s);
    }
}
