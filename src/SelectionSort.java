import java.util.Arrays;

/**
 * @author ahasani
 */
class SelectionSort {


    public static void main(String[] args) {

        int[] lst = {9, 5, 7, 3, 6, 2, 1};

        applySelectionSort(lst);

        //Arrays.sort(lst);
        System.out.println(Arrays.toString(lst));
    }

    private static void applySelectionSort(int[] list) {
        int swap;
        int iteration = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                iteration++;
                if (list[j] < list[i]) {
                    swap = list[i];
                    list[i] = list[j];
                    list[j] = swap;
                }
                System.out.println("Iteration " + iteration + ": " + Arrays.toString(list));
            }
        }
    }

}
