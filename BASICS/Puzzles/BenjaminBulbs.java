/* 
    https://leetcode.com/problems/bulb-switcher/
    https://www.geeksforgeeks.org/puzzle-1000-light-bulbs-switched-on-off-by-1000-persons-passing-by/

*/

import java.util.Scanner;

class BenjaminBulbs{
    public static int solve(int n){
        int c = 0;
        for(int i = 1;i*i <= n;i++)
            c++;
        return c;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter no of bulbs: ");
      int n = sc.nextInt();
      System.out.println("No of bulbs that will glow: "+solve(n));
    }
}