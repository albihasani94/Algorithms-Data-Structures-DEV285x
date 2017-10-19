package moduleone;

/**
 * @author ahasani
 */
class LinearSearch {

    public static void main(String[] args) {

        int[] lst = {4, 9, 7, 1, 3, 6, 5};

        int index = linearSearch(lst, 6);

        System.out.println(index);
    }

    static private int linearSearch(int[] lst, int number) {
        int index;
        for (int i = 0; i < lst.length; i++) {
            System.out.println(String.format("Iteration %s", i));
            if (lst[i] == number) {
                index = i;
                return index;
            }
        }
        System.out.println("Element not found in list");
        return -1;
    }
}
