package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int lines;
        System.out.println("enter number of lines : ");
        lines=in.nextInt();
        printPatten(lines);
    }

    public static void  printPatten(int n){
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= (2*n)-1; j++) {
            
                System.out.print(((i+j)%2==0)?"1":"0");
            
        }
        System.out.println();
      }
    }
}
