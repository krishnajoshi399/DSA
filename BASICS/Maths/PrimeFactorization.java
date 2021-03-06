/*

Prime factors of 12 = 2*2*3

*/

import java.util.Scanner;

class PrimeFactorization{
    public static void primeFactorization(int n){
        boolean isprime = true;
        for(int i=2;i*i<=n;i++){
            while(n>0){
                if(n%i==0){
                    System.out.println(i+" ");
                    n/=i;
                }
                else
                    break;
            }
        }
        if(n>1)
            System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        primeFactorization(n);
    }
}