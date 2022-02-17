/* 

for n = 6759, print following:
6
7
5
9

*/

import java.util.Scanner;

class PrintDigits{
    public static void printDigits(int n){
        int c = 0, bk = n;
        while(bk>0){
            c++;
            bk/=10;
        }
        int d = (int)Math.pow(10, c-1);
        while(d>0){
            System.out.println(n/d);
            n%=d;
            d/=10;
        }
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      printDigits(n);
      System.out.println();
    }
}