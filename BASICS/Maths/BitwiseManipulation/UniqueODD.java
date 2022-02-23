/*

every elemnet in array occurs odd times(3 times) except one element

*/
/*

Every element appears even times except one elemnt

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class UniqueODD{
    public static int uniqueOdd(int[] a, int n){
        int ans = 0, p = 1;
        int[] t = new int[64];
        for(int i=0;i<n;i++){
            int bk = a[i], count = 0;
            while(bk>0){
                int r = bk%2;
                t[count] = t[count]+r;
                count++;
                bk /= 2;
            }
        }
        for(int k: t){
            ans += k%3 > 0? (k%3)*p:0;
            p *= 2;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Unique = "+uniqueOdd(a, n));
    }
}