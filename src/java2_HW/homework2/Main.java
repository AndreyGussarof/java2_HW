package java2_HW.homework2;


import java.util.Arrays;

public class Main {



    int i;
    int j;
    int arr2[][];


    public static void main(String[] args) {

        int i = 4;
        int j = 4;

        String[][] arr = new String[i][j];
        String[][] arrs = {{"a", "b", "c", "d",}, {"e", "f", "g", "h"}, {"i", "j", "k", "l"}, {"m", "n", "o", "p"}};

        try {
            testArray1(arrs, 5, 5);

        } catch (MySizeArrayException e ) {
            System.out.println("неправильный размер массива");

        }
        try{
        testArray2(arrs);
        } catch (MyDataArrayException e ) {
            System.out.println("неправильный размер массива");

        }
    }

    public static void testArray1(String[][] arr, int i, int j) throws MySizeArrayException {
        if (i != 4 | j != 4) {
            throw new MySizeArrayException(i, j);
        }
        System.out.print(Arrays.deepToString(arr));
    }

    public static void testArray2(String[][] arr) throws MyDataArrayException {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyDataArrayException("Строковое значение ");
                }
            }
        }
    }
}