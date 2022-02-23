/*
    
*/

import java.util.Scanner;

class MagicNumber{
    public static int NthMagicNumber(int n){
        int sum = 0, p = 5;
        while(n>0){
            int t = n&1;
            sum += t*p;
            p *= 5;
            n = n>>1;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth number: ");
        int n = sc.nextInt();
        System.out.println(n+"th MAGIC number = "+NthMagicNumber(n));
    }
}

