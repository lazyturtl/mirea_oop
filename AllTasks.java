import java.util.Scanner;

public class AllTasks {
    // ====== Задача 3 ======
    public static void task3() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }

    // ====== Задача 4 ======
    public static void task4(Scanner sc) {
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // сумма через do-while
        int sum1 = 0, i = 0;
        do {
            sum1 += arr[i];
            i++;
        } while (i < n);

        // сумма через while
        int sum2 = 0, j = 0;
        while (j < n) {
            sum2 += arr[j];
            j++;
        }

        // поиск max и min
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < n; k++) {
            if (arr[k] > max) max = arr[k];
            if (arr[k] < min) min = arr[k];
        }

        System.out.println("Сумма элементов (do-while): " + sum1);
        System.out.println("Сумма элементов (while): " + sum2);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

    // ====== Задача 5 ======
    public static void task5(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        } else {
            System.out.println("Аргументы командной строки:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }

    // ====== Задача 6 ======
    public static void task6() {
        System.out.println("Первые 10 чисел гармонического ряда:");
        double harmonic = 0.0;
        for (int i = 1; i <= 10; i++) {
            harmonic += 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, harmonic);
        }
    }

    // ====== Задача 7 ======
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void task7(Scanner sc) {
        System.out.print("Введите число для вычисления факториала: ");
        int number = sc.nextInt();
        long fact = factorial(number);
        System.out.println("Факториал числа " + number + " = " + fact);
    }

    // ====== Главное меню ======
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задачу для выполнения (3-7): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 3:
                task3();
                break;
            case 4:
                task4(sc);
                break;
            case 5:
                task5(args);
                break;
            case 6:
                task6();
                break;
            case 7:
                task7(sc);
                break;
            default:
                System.out.println("Нет такой задачи.");
        }

        sc.close();
    }
}
