package homework.lesson2;


public class Exercise3 {
    public static void main(String[] args) {

        LineSearch();
    }

    public static void LineSearch() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}
