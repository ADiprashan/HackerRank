
package utopiantree;

import java.util.Scanner;

/**
 *
 * @author Rajitha Prashan
 */
public class Utopiantree {
      private static int Utopian_height(int Cycles)
    {
    int height=1;
    if(Cycles<=0)
        return 1;
    for(int i=1;i<=Cycles;i++)
        {
        if(i%2!=0)
            height=2*height; //Spring
        else
            height+=1;//summer 
    }
    return height;
}
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        if(T>=1 && T <=10 ){
        for(int i=0;i<T;i++)
            {
              int Cycles = input.nextInt();
              if(0<=Cycles && Cycles<=60){
            System.out.println(Utopian_height(Cycles));
              }
              else {
                 System.out.println(" Test cases should be : 0≤N≤60 ");
            }
        }
    }
        else{
        
            System.out.println(" Test cases should be : 1≤T≤10 ");
        }
        input.close(); //close scanner
       }
    }
    

