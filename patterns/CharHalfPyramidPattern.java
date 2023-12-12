package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;

/*
pattern to perint
  A
  BC
  DEF
  GHIJ
  KLMNO
 */
public class CharHalfPyramidPattern {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      char toPrint='A';
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(toPrint);
            toPrint++;
        }
        System.out.println();
      }
    }
}
