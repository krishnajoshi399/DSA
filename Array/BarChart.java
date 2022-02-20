/*

for n =5, a:[3, 0, 7, 2, 5], print:

      *
      *
      *     *
      *     *
*     *     *
*     *  *  *
*     *  *  *
3  0  7  2  5

*/

import java.util.Scanner;   

class BarChart{
    public static void displayBarChart(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i: a)
            max = Math.max(max, i);

        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(i<=a[j])
                    System.out.print("*\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        displayBarChart(a, n);
    }
}