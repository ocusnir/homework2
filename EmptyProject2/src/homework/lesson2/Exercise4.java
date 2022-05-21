package homework.lesson2;

public class Exercise4 {

    public static void main(String[] args) {

        Diagonal();
    }

    public static void Diagonal () {

        int a = 0;
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            a++;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = a++;
                if (a > 4)
                    a = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
