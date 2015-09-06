package averybigsum;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Averybigsum {

    public static void main(String[] args) {
        long sum = 0;
        int arraysize = 0;
        Scanner in = new Scanner(System.in);

        arraysize = in.nextInt();

        if (0 < arraysize && arraysize <= 1000) {
            long array[] = new long[arraysize];

            for (int i = 0; i < arraysize; i++) {

                array[i] = in.nextLong();

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
