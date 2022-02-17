/*

ARRAY MUST BE SORTED

Given n = 7: [2, 6, 15, 34, 66, 73, 97]
for key = 6 , print "6 is present at index 1"
for key = 12, print "12 is not present in array"


*/


import java.util.Scanner;

class BinarySearch{

/*
 Iterative solution
 Complexity: O(log(n))T / O(1)S
 */

    public static int binarySearchIterative(int[] a,int l, int h, int key){ 
        while(l<=h){
            int m = h-(h-l)/2;
            if(a[m] == key)
                return m;
            else if(a[m] < key)
                l = m+1;
            else
                h = m-1;
        } 
        return -1;
    }

/*
Recursive solution
Complexity: O(log(n))TS
*/
    public static int binarySearchRecursive(int[] a, int l, int h, int key){
        if(l>h)
            return -1;
        int m = h-(h-l)/2;
        if(a[m] == key)
            return m;
        else if(a[m] <= key)
            return binarySearchRecursive(a, m+1, h, key);
        return binarySearchRecursive(a, l, m-1, key);
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
        int res1 = binarySearchIterative(a, 0, n-1, key);
        if(res1 == -1)
            System.out.println(key+" not present in array");
        else
            System.out.println(key+" present at index "+res1);
        int res2 = binarySearchRecursive(a, 0, n-1, key);
        if(res2 == -1)
            System.out.println(key+" not present in array");
        else
            System.out.println(key+" present at index "+res2);
    }
}