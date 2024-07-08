package Quiz2;

public class SortUtility {

    public static void BubbleSort(int[] array) {
        boolean InOrder;
        for (int i = 0; i < array.length; i++) {
            InOrder = true;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    InOrder = false;
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            if (InOrder)
                break;
        }
    }
}
