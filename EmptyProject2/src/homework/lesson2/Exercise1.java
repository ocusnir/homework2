package homework.lesson2;


public class Exercise1 {
    public static void main(String[] args) {

        InvertArray();

        }

    public static void InvertArray() {
        int[] arr01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < arr01.length; i++){
            if(arr01[i] < 1 ){
                arr01[i] = arr01[i]+1;
                } else {
                arr01[i] = arr01[i]-1;
               }

            System.out.print( " " + arr01[i]);

            }

        System.out.println();

        }
    }
