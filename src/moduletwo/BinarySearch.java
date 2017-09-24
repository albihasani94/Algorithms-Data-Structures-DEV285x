package moduletwo;

import java.util.Arrays;

/**
 * @author ahasani
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] lst = {1, 3, 4, 5, 7, 9, 13, 15, 16, 17, 19};

        int index = binarySearch(lst, 15, 0, lst.length);

        System.out.println(index);
    }


    static int binarySearch(int[] lst, int number, int low, int high) {
        if (high < low)
            return -1;
        int middle = (low + high) / 2;
        if (number < lst[middle]) {
            return binarySearch(lst, number, low, middle - 1);
        } else if (number > lst[middle]) {
            return binarySearch(lst, number, middle + 1, high);
        } else
            return middle;
    }

}