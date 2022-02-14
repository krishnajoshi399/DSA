/*

for x = 3, n = 4, print "3^4  = 81"

*/

import java.util.Scanner;

class Power{

/*
 Iterative solution
 Complexity: O(n)T / O(1)S
 */

    public static long powerIterative(int x, int n){
        long ans = 1;
        for(int i=1;i<=n;i++)
            ans*=x;
        return ans; 
    }

// Recurive solution: O(n)TS

    public static long powerRecursive(int x, int n){
        if(n == 0)
            return 1;
        return x*powerRecursive(x, n-1); 
    }

/*
Recursive solution
Complexity: O(log(n))TS
*/
    public static long powerLogarithm(int x, int n){
        if(n == 0)
            return 1;
        long ans = powerLogarithm(x, n/2) * powerLogarithm(x, n/2);
        if(n%2 != 0)
            return x*ans;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(x+"^"+n+" = "+powerIterative(x, n));
        System.out.println(x+"^"+n+" = "+powerRecursive(x, n));
        System.out.println(x+"^"+n+" = "+powerLogarithm(x, n));
    }
}