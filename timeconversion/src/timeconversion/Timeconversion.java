package timeconversion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Timeconversion {

    public static void main(String[] args) throws Exception {

        int h, m, s;
        String f;
        Scanner in = new Scanner(System.in);
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mma");

        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        f = in.next();
        if (1<=h && h<=12 && 0<=m && m<=59 && s<=0 && s<=59) {
//       Date date = parseFormat.parse("10:30 PM");
            Date date = parseFormat.parse(h + ":" + m + f);
            System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
        }else{
        System.out.println("Not the correct format");
        }
        
    }
}
