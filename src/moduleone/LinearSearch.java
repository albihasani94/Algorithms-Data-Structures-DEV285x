package moduleone;

/**
 * @author ahasani
 */
class LinearSearch {

    public static void main(String[] args) {

        int[] lst = {4, 9, 7, 1, 3, 6, 5};

        int index = linearSearch(lst, 5);

        System.out.println(index);
    }

    static int linearSearch(int[] lst, int number) {
        int index=0;
        for(int i=0; i<lst.length; i++) {
            if (lst[i] == number) {
                index=i;
            }
        }
        return index;
    }
}
