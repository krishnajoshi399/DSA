/*

Every element appears even times except one elemnt

*/

import java.util.Scanner;

class UniqueXOR{
    public static int uniqueXOR(int[] a, int n){
        int ans = 0;
        for(int i:a)
            ans^=i;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Unique = "+uniqueXOR(a, n));
    }
}