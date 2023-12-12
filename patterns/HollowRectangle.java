package DataStructursAndAlgorithms.patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int height,width;
        System.out.println("enter number of height : ");
        height=in.nextInt();
        System.out.println("enter number of width : ");
        width=in.nextInt();
        printStarPatten(height,width);
    }

    public static void  printStarPatten(int row,int col){
      for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
            if(i==1 || i==row||j==1||j==col){
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
