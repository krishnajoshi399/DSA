import java.util.Scanner;

class Factorial{

/*
 Iterative solution
 Complexity: O(n)T / O(1)S
 */

    public static long factIterative(int n){
        long ans = 1; 
        for(int i=1;i<=n;i++)
            ans*=i;
        return ans; 
    }

/*
Recursive solution
Complexity: O(n)TS
*/
    public static long factRecursive(int n){
        if(n==0 || n==1)
            return 1;
        return n*factRecursive(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factIterative(n));
        System.out.println(factRecursive(n));
    }
}