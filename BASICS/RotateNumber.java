/* 
    
for n = 426135, and 
if k = 2 then move k digits from back of n to front of n i.e 354261
if k> digits[n] k = k % digits[n]
if k = -3 then move k digits from front of n to back of n i.e 135426   

*/

import java.util.Scanner;

class RotateNumber{
    public static int rotate(int n, int k){
        int ans = 0, c = (int)Math.log10(n)+1;
        k = k%c;
        if(k == 0)
            return n;
        k = k < 0? k+c:k;
        int r = n%(int)Math.pow(10, k);
        int q = n/(int)Math.pow(10,k);
        ans = r*(int)Math.pow(10, c - k)+q;
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      System.out.print("Enter k: ");
      int k = sc.nextInt();
      System.out.println(n+" after "+k+" rotations = "+rotate(n,k));
    }
}