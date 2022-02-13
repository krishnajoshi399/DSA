/*

for n = 23, print "23 is a prime no"

for n = 15, print "15 is not a prime no

*/

import java.util.Scanner;

class IsPrime{

// linear solution 

    public static void isPrimeLinear(int n){
        boolean isprime = true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                isprime = false;
                System.out.println(n+" is not a prime no");
                break;
            }
        }
        if(isprime == true)
            System.out.println(n+" is a prime no");

    }

// SquareRoot of N solution

    public static void isPrimeRootOfN(int n){
        boolean isprime = true;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                isprime = false;
                System.out.println(n+" is not a prime no");
                break;
            }
        }
        if(isprime == true)
            System.out.println(n+" is a prime no");

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isPrimeLinear(n);
        isPrimeRootOfN(n);
    }
}