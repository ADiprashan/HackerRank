package simplearraysum;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Simplearraysum {

    public static void main(String[] args) {
        int sum = 0, arraysize = 0;
        int element;
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");

        arraysize = in.nextInt();

        if (0 < arraysize && arraysize <= 1000) {
            int array[] = new int[arraysize];
            //   System.out.println("Enter the array elements:");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);

        } else {
            System.out.println("Array size Shloud be 1≤N≤1000 ");
        }
    }

}
