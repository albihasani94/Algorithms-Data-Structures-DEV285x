package moduleone;

import java.util.Arrays;

/**
 * @author ahasani
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] lst = {9, 2, 3, 8, 14, 7, 0, 1, 2, 42, 3, 4};

        bubbleSort(lst);

        System.out.println(Arrays.toString(lst));
    }

    static private void bubbleSort(int[] list) {
        int swap;
        int n = list.length;
        int j = 0;
        int iteration = 0;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n - j; i++) {

                if (list[i - 1] > list[i]) {
                    swap = list[i - 1];
                    list[i - 1] = list[i];
                    list[i] = swap;
                    swapped = true;
                }
                String message = String.format("Iteration %s: %s", iteration++, Arrays.toString(list));
                System.out.println(message);
            }

        } while (swapped);
    }
}
