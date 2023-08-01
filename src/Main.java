import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");

        int[] arr1 = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(arr1));

        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr2));

        float[] arr3 = {1.35f, 5.5f, 85.31f};
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        // Печатать было не нужно, просто очень хотелось :)
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int[] arr1 = new int[] {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        float[] arr3 = {1.35f, 5.5f, 85.31f};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);

            if (i != arr1.length - 1) {
              System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);

            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);

            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");

        int[] arr1 = new int[] {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        float[] arr3 = {1.35f, 5.5f, 85.31f};

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
    public static void task4 () {
        System.out.println("Задача 4");

        int[] arr1 = {1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);

            if (i % 2 ==0) {
                System.out.println(i++);
            }
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
    }
}