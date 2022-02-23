/*

https://leetcode.com/problems/flipping-an-image/

*/
import java.util.Scanner;
import java.util.Arrays;

class FlippingImage{
    public static void flipImage(int[][] m){
        for(int[] r: m){
            for(int i=0;i<(m[0].length+1)/2;i++){
                int t = r[i]^1;
                r[i] = r[m[0].length-1-i]^1;
                r[m[0].length-1-i] = t;
            }
        }
    }
    public static void printImage(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j] = sc.nextInt();
        printImage(m);
        flipImage(m);
        System.out.println("After flipping.....")
        printImage(m);
    }
}