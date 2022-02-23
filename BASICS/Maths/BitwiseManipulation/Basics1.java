/*

Basics covered by kunal kushwaha
Link to youtube: https://www.youtube.com/watch?v=fzip9Aml6og

*/

import java.util.Scanner;

class Basics1{

// LSB of a number determines whether it is ODD or EVEN
// MSB determines whether it is +ve / -ve
    public static boolean isOdd(int n){
        return (n&1) == 1;
    }

/*
 
n = (13)base10 = (1101)base2, if ans > 0 then bit is set
when k = 1, ans = 1
when k = 2, ans = 0
when k = 3, ans = 4
when k = 4, ans = 8

*/
    public static int NthBitFromEnd(int n, int k){
        return (n & 1<<(k-1));
    }

/*
 
n = (9)base10 = (1001)base2,
when k = 1, ans = 1
when k = 2, ans = 13
when k = 3, ans = 15
when k = 4, ans = 15

*/
    public static int setNthBitFromEnd(int n, int k){
        return (n | 1<<(k-1));
    }

// RESET kth bit from end:

    public static int resetNthBitFromEnd(int n, int k){
        return (n & ~(1<<(k-1)));
    }

// 1st SET BIT from end of a number

    public static int firstSetBitFromEnd(int n){
        return (n & ((~n)+1));
    }

// Find if a number is power of 2

    public static boolean powerOf2(int n){
        return (n&(n-1)) == 0;
    }

/*

count of digits in base 'b' of a no 'n'
= return (int)(Math.log(n)/Math.log(b))+1;

*/

    public static int Dcount(int n){
        return (int)(Math.log(n)/Math.log(10))+1;
    }

/*

Sum of 4th row in pascals triangle = 8

*/

    public static int NthSumPascals(int n){
        return 1<<(n-1);
    }

/*

count of set bits in 13 = 3 ----- {13 = 1101 in base 2}

*/
    public static int countOfSetBits1(int n){
        int c = 0;
        while(n>0){
            n = n - (n&(~n + 1));
            c++;
        }
        return c;
    }
    public static int countOfSetBits2(int n){
        int c = 0;
        while(n>0){
            n = n & (n-1);
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n+" is an odd number? "+isOdd(n));
        System.out.print("Enter kth bit from end: ");
        int k = sc.nextInt();
        System.out.println(k+"th bit from end = "+NthBitFromEnd(n, k));
        System.out.println("Setting "+k+"th bit from end = "+setNthBitFromEnd(n, k));
        System.out.println("Resetting "+k+"th bit from end = "+resetNthBitFromEnd(n, k));
        int ans = (int)(Math.log(firstSetBitFromEnd(n))/Math.log(2))+1;
        System.out.println("1st set bit from end of "+n+" = "+ans);
        System.out.println(n+" is power of 2 ? "+powerOf2(n));
        System.out.print("Enter a number whose no of digit is to counted: ");
        n = sc.nextInt();
        System.out.println("Digit-count of number "+n+" = "+Dcount(n));
        System.out.println("Sum of "+n+"th row in Pascals triangle = "+NthSumPascals(n));
        System.out.println("No of set bits in "+n+" = "+countOfSetBits1(n)+" , "+countOfSetBits2(n));
    }
}

