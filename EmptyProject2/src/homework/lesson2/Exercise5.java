package homework.lesson2;


import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {

        MaxNum();

    }

    static void MaxNum() {

        Random random = new Random();
        int[] arr01 = new int[8];

        for(int i = 0; i < arr01.length; i++){
                arr01[i] = random.nextInt(100);
                System.out.print(arr01[i] + " ");

        }

        System.out.println();

        //поиск максимального числа
        int a = 0;
        int max = arr01[a];
        for(int i = 0; i < arr01.length; i++){
                if (arr01[i] > max){
                    max = arr01[i];
                    a = i;
                }
        }

        //Поиск минмального числа
        int b = 0;
        int min = arr01[b];
        for(int i = 0; i < arr01.length; i++){
                if (arr01[i] < min){
                    min = arr01[i];
                    b = i;
                }
        }

        System.out.printf("The place of max number in this array is : [%d]\n", a);
        System.out.printf("The place of min number in this array is : [%d]\n", b);
        System.out.println("The max number of this array is : " + max);
        System.out.println("The min number of this array is : " + min);
    }
}
