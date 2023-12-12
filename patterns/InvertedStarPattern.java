package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;

public class InvertedStarPattern {
     public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printStarPatten(lines);
    }

    public static void  printStarPatten(int n){
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j--) {
            System.out.print("*");
        }
        System.out.println();
      }
    }
}
