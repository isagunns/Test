package Quiz2;

import java.util.Arrays;

public class MergeUtility {
    public static int[] merge(int[] array1, int[] array2) {
        SortUtility.BubbleSort(array1);
        SortUtility.BubbleSort(array2);
        int len1 = array1.length;
        int len2 = array2.length;
        int result[] = new int[len1 + len2];
        int x = 0;
        int y = 0;
        int z = 0;
        int counter = 0;

        while (x < len1 && y < len2) {
            if (array1[x] < array2[y]) {
                result[z] = array1[x];
                z++;
                x++;
            } else if (array1[x] > array2[y]) {
                result[z] = array2[y];
                z++;
                y++;
            } else {
                result[z] = array1[x];
                y++;
                z++;
                x++;
                counter++;
            }
        }

        while (x < len1) {
            result[z] = array1[x];
            z++;
            x++;
        }

        while (y < len2) {
            result[z] = array2[y];
            z++;
            y++;
        }

        return Arrays.copyOf(result, len1 + len2 - counter);
    }
}
