public class MergeStudentsTest {
    public static void main(String[] args) {

        Student[] group1 = {
                new Student("Ivan", 12),
                new Student("Olga", 34)
        };

        Student[] group2 = {
                new Student("Petr", 5),
                new Student("Anna", 20)
        };

        Student[] merged = new Student[group1.length + group2.length];
        System.arraycopy(group1, 0, merged, 0, group1.length);
        System.arraycopy(group2, 0, merged, group1.length, group2.length);

        Student[] sorted = MergeSortStudents.mergeSort(merged);

        System.out.println("Merged & sorted list:");
        for (Student s : sorted)
            System.out.println(s);
    }
}
