package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;
/*
      ******* 
     *******  
    *******   
   *******    
  *******
 *******
*******

*/

public class RhombusPattern {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      
      for (int i =1; i <= n; i++) {
        for (int j = 1; j <=2*n; j++) {

            if(i+j>n && i+j<=2*n){
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
