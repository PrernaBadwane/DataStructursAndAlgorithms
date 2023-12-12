package DataStructursAndAlgorithms.patterns;
/*
pattern to perint
 1
 12
 123
 1234
 12345
 123456
 */

import java.util.Scanner;

public class HalfPyramidPattern {
    

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
      }
    }
}


