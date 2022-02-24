/*

BinarySearch Logic: O(log(n))T / O(1)S

squareRoot of 16 = 4
squareRoot of 20 = 4.472

*/

import java.util.Scanner;

class SquareRootOfN{
    public static double squareRootN(int n, int p){
        int l = 0, h = n, m = 0;
        while(l<=h){
            m = h-(h-l)/2;
            if(m*m == n)
                return m;
            if(m*m>n)
                h = m-1;
            else
                l = m+1;
        }
        double res = m, d = 0.1;
        for(int i=1;i<=p;i++){
            while(res*res<=n){
                res+=d;
            }
            res-=d;
            d*=0.1;
        }
        return res;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter precision: ");
        int p = sc.nextInt();
        System.out.printf("Square root of %d = %.3f",n , squareRootN(n,p));
    }
}