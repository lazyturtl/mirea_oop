import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<StudentGPA> {

    @Override
    public int compare(StudentGPA o1, StudentGPA o2) {
        return Double.compare(o2.getGPA(), o1.getGPA()); // сортировка по убыванию
    }

    public void quickSort(StudentGPA[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(StudentGPA[] arr, int low, int high) {
        StudentGPA pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) < 0) { // сортировка по убыванию
                i++;
                StudentGPA temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        StudentGPA temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
