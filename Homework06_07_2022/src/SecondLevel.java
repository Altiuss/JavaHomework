// Дан квадратный массив (количество строк совпадает с количеством столбцов),
// заполненный нулями. Заполнить обе диагонали массива единицами.

import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {


        int[][] table3 = new int[5][5];

        for (int i = 0; i < table3.length; i++) {
            table3[i][i] = 1;
            table3[table3.length - 1 - i][i] = 1;

//            table3   [4]                [0] = 1;
//            table3   [3]                [1] = 1;
//            table3   [1]                [3] = 1;
//            table3   [0]                [4] = 1;

        }
        print2dArray(table3);


    }

    private static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}