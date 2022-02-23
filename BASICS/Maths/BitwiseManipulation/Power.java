/*
    3 raise to 6 = 729
*/

import java.util.Scanner;

class Power{
    public static long power(int x, int n){
        int ans = 1;
        while(n>0){
            if((n&1) == 1)
                ans *= x;
            x *= x; 
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x and power n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x+" raise to "+n+" = "+power(x, n));
    }
}

