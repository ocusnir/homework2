package homework.lesson2;

public class Exercise2 {
    public static void main(String[] args) {

        FillArray();
    }

     public static void FillArray() {

        int[] array = new int[8];

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0) {
                array[1] = array[0] + 3;
                array[2] = array[1] + 3;
                array[3] = array[2] + 3;
                array[4] = array[3] + 3;
                array[5] = array[4] + 3;
                array[6] = array[5] + 3;
                array[7] = array[6] + 3;

            }
                System.out.print(" " + array[i] );
        }
         System.out.println();
    }
}
