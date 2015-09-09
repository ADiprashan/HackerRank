package staircase;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Staircase {

    public static void main(String[] args) {

        int n, i, j, k;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        if (0 < n && n <= 1000) {

            for (i = 1; i <=n; i++) {
                for (j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("#");
                }
                System.out.print("\n");

            }

        } else {
            System.out.println("Height Shloud be 1≤N≤1000 ");
        }
    }

}
