//In this assignment you should write the program that create a new array int[n][m],
// fill it with random integers and displays it

import java.util.Scanner;

public class FirstLevel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array row value:");
        int n = sc.nextInt();
        System.out.println("Enter array column value:");
        int m = sc.nextInt();
        int[][] table = new int[n][m];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 1 + (int) (Math.random() * 10);

            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(table[i][j] + " ");
            }

        }



    }

    }

