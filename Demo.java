package Quiz2;

import java.util.Scanner;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the numbers for the first array (press '-1' to exit.) (Exp: 5 8 3 4 9 23 -1):");

            int a;
            for (a = 0; a < array1.length; a++) {
                int number = scanner.nextInt();
                if (number == -1) {
                    break;
                } else {
                    array1[a] = number;
                }
            }
            array1 = Arrays.copyOf(array1, a);

            System.out.println("Enter the numbers for the second array (press '-1' to exit.) (Exp: 5 8 3 4 9 23 -1):");

            int b;
            for (b = 0; b < array2.length; b++) {
                int number = scanner.nextInt();
                if (number == -1) {
                    break;
                } else {
                    array2[b] = number;
                }
            }

            array2 = Arrays.copyOf(array2, b);
        }

        System.out.println();
        System.out.println();
        System.out.println("First Array:");
        for (int c = 0; c < array1.length; c++) {
            System.out.print(array1[c] + " ");
        }

        System.out.println("\nThe first array from smallest to largest(Bubble Sort):");
        SortUtility.BubbleSort(array1);
        for (int d = 0; d < array1.length; d++) {
            System.out.print(array1[d] + " ");
        }

        System.out.println();
        System.out.println("\nSecond Array:");
        for (int c = 0; c < array2.length; c++) {
            System.out.print(array2[c] + " ");
        }

        System.out.println("\nThe second array from smallest to largest(Bubble Sort):");
        SortUtility.BubbleSort(array2);
        for (int d = 0; d < array2.length; d++) {
            System.out.print(array2[d] + " ");
        }

        int[] x = MergeUtility.merge(array1, array2);
        System.out.println();
        System.out.println("\nMerged Array:");
        for (int o : x) {
            System.out.print(o + " ");
        }
    }
}
