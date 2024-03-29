package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      
      for (int i =1; i <= n; i++) {
        for (int j =1; j <=(n-i); j++) {
          System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i =n; i >= 1; i--) {
        for (int j =0; j<(n-i); j++)
         {
          
          System.out.print(" ");
        }
        for (int j=(2*i)-1;j>=1;j--)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      
      
    }
}
