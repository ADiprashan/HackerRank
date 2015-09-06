package diagonaldiff;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Diagonaldiff {

    public static void main(String[] args) {
        int m;
        int sum = 0;
        int sum2 = 0;
        Scanner in = new Scanner(System.in);

        m = in.nextInt();

        if (0 < m && m <= 1000) {
            int[][] matrix = new int[m][m];

            // Input Matrix
            for (int i = 0; i < matrix.length; i++) {
//            System.out.println("Enter elements of " + i + " row");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
            //taking sum of major diagonal
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        sum += matrix[i][j];
                    }
                }
            }
            // taking anti major diagonal sum
            for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {

                sum2 += matrix[i][j];

            }
            //difference of the sums

            System.out.println(Math.abs(sum - sum2));

        } else {
            System.out.println("Array size Shloud be 1≤N≤1000 ");
        }
    }

}
