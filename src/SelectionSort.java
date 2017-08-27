import java.util.Arrays;

class SelectionSort {


    public static void main(String[] args) {

        int[] lst = {4, 9, 7, 1, 3, 6, 5};

        applySelectionSort(lst);

        //Arrays.sort(lst);
        System.out.println(Arrays.toString(lst));
    }

    private static void applySelectionSort(int[] list) {
        int swap;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    swap = list[i];
                    list[i] = list[j];
                    list[j] = swap;
                }
            }
        }
    }

}
