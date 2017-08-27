import java.util.Arrays;

/**
 * @author ahasani
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] lst = {9, 5, 7, 3, 6, 2, 1};

        bubbleSort(lst);

        System.out.println(Arrays.toString(lst));
    }

    static void bubbleSort(int[] list) {
        int swap;
        int n = list.length;
        int j = 0;
        int iteration = 0;
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 1; i < n - j; i++) {
                iteration++;
                if (list[i - 1] > list[i]) {
                    swap = list[i - 1];
                    list[i - 1] = list[i];
                    list[i] = swap;
                    swapped = true;
                }
                System.out.println("Iteration " + iteration + ": " + Arrays.toString(list));
            }

        } while (swapped == true);
    }
}
