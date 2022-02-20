/*

for n =6, a:[2, 1, 5, 1, 3, 2], subarray_size k = 3,
max sum with subarray of size 3 = 9 [5, 1, 3]

Bruteforce: O(n*n)T / O(1)S

SWT: O(n)T / O(1)S

*/

import java.util.Scanner;   

class MaxSumSubarrayK{
    public static int findMaxSumSubarrayK(int[] a, int k){
        int wstart = 0, wend = 0, wsum = 0, max = Integer.MIN_VALUE;
        for(wend=0;wend<a.length;wend++){
            wsum+=a[wend];
            if(wend>=k-1){
                max = Math.max(max, wsum);
                wsum-=a[wstart++];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.print("enter subarray size k: ");
        int k =sc.nextInt();
        System.out.println("Max sum with subarray of size "+k+" = "+findMaxSumSubarrayK(a, k));
    }
}