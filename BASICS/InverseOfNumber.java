/* 

CONSTRAINT: Every digit in the no should be unique and in the range [1 - N] where N is no of digits
    
for n = 426135, Inverse = 416253

*/

import java.util.Scanner;

class InverseOfNumber{
    public static int inverse(int n){
        int ans = 0, p = 0, d = 1;
        while(n>0){
            p = n%10;
            ans += d*(int)Math.pow(10, p-1);
            d++;
            n/=10;
        }
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      System.out.println("Inverse of "+n+" = "+inverse(n));
    }
}