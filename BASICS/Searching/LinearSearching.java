/*

Given n = 5: [3, 9, 6 , 1, 5]
for key = 6 , print "6 is present in array"
for key = 12, print "12 is not present in array"


*/


import java.util.Scanner;

class LinearSearching{

/*
 Iterative solution
 Complexity: O(n)T / O(1)S
 */

    public static boolean linearSearchIterative(int[] a, int key){ 
        for(int i=0;i<a.length;i++)
            if(a[i] == key)
                return true;
//              return i; 
        return false;
    }

/*
Recursive solution
Complexity: O(n)TS
*/
    public static boolean linearSearchRecursive(int[] a, int n, int key){
        if(n<1)
            return false;
        if(a[n-1] == key)
            return true;
//          return n-1;
        return linearSearchRecursive(a, n-1, key);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        System.out.println(linearSearchIterative(a, key)==true? key+" is present in array": key+" is not preent in array");
        System.out.println(linearSearchRecursive(a, n, key)==true? key+" is present in array": key+" is not preent in array");
    }
}