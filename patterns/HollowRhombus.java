package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;
/*
      ******* 
     *     *  
    *     *   
   *     *    
  *     *
 *     *
*******

*/

public class HollowRhombus {
      public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <=(2*n)-1; j++) {
    
                if(i+j==n+1 || i+j==2*n ||( i==1 && j>=n) || (i==n && j<=n)){
                    System.out.print("*");
                  }
                  else{
                      System.out.print(" ");
                  }
                
            }
            System.out.println();
          }
    }
}
