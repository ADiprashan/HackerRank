package plusminus;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Plusminus {

    public static void main(String[] args) {
        int element, arraysize = 0;
        float negative = 0, zero = 0, positive = 0;
        Scanner in = new Scanner(System.in);

        arraysize = in.nextInt();

        if (0 < arraysize && arraysize <= 1000) {

            int array[] = new int[arraysize];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }

            for (int i = 0; i < array.length; i++) {

                element = array[i];

                if (element < 0) {
                    negative++;
                } else if (element == 0) {
                    zero++;
                } else {
                    positive++;
                }

            }

            System.out.printf("%.6f\n%.6f\n%.6f", positive / arraysize, negative / arraysize, zero / arraysize);

        } else {
            System.out.println("Array size Shloud be 1≤N≤1000 ");
        }
    }

}
