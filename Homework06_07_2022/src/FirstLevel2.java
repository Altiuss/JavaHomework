import java.util.Scanner;

//Implement the method that takes int[][] array and row number
// and checks that the average of the elements in a row is greater than 0
public class FirstLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = {{5, 6, 7}, {-7, -8, 9}, {11, 45, 71}};
        int n = sc.nextInt();
        if ( n < 0  || n > table.length - 1) {


             System.out.println("The number you entered is outside the bounds of the array");
             return;
        }




        checkArrayElement(table, n);
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
    }

            private static boolean checkArrayElement ( int[][] table, int n){


                int sum = 0;
                for (int i = 0; i < table.length; i++) {
                    if (n == i) {
                        for (int j = 0; j < table[i].length; j++) {
                            sum = sum + table[i][j];


                        }
                        if (sum / (n + 1) > 0) {
                            System.out.println("The average of the elements in a row is greater than 0");
                        } else {
                            System.out.println("The average of the elements in a row is smaller than 0");
                        }
                        System.out.println(sum);
                    }
                }
                return false;
            }

        }

