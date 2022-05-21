package homework.lesson2;


import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {

        MaxNum();

    }

    static void MaxNum() {

        Random random = new Random();
        int[] table02 = new int[8];

        for(int i = 0; i < table02.length; i++){
                table02[i] = random.nextInt(100);
                System.out.print(table02[i] + " ");

        }

        System.out.println();

        //поиск максимального числа
        int a = 0;
        int max = table02[a];
        for(int i = 0; i < table02.length; i++){
                if (table02[i] > max){
                    max = table02[i];
                    a = i;
                }
        }

        //Поиск минмального числа
        int b = 0;
        int min = table02[b];
        for(int i = 0; i < table02.length; i++){
                if (table02[i] < min){
                    min = table02[i];
                    b = i;
                }
        }

        System.out.printf("The place of max number in this array is : [%d]\n", a);
        System.out.printf("The place of min number in this array is : [%d]\n", b);
        System.out.println("The max number of this array is : " + max);
        System.out.println("The min number of this array is : " + min);
    }
}