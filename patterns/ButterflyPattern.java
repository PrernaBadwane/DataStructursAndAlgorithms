package DataStructursAndAlgorithms.patterns;

/*

 *         *   
 * *     * *
 * * * * * *
 * * * * * *
 * *     * *
 *         *
 
*/
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      for (int i = 1; i <= n/2; i++) {
        for (int j = 1; j <= n; j++) {

            if (j<=i || i+j>n) {
            System.out.print("*");
                
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println();
      }
      for (int i = n/2; i <= n; i++) {
        for (int j = 1; j <= n; j++) {

            if ( i+j<=n|| i<j) {
            System.out.print("*");
                
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println();
      }
    }
    
}
