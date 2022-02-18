/* 

(32)base8 = (26)base10 = (11010)2

*/

import java.util.Scanner;

class BaseToBase{
    public static int bToB(int n, int b1, int b2){
        System.out.println(bToDecimal(n, b1));
        return decimalToB(bToDecimal(n, b1), b2);
    }
    public static int bToDecimal(int n, int b){
        int ans = 0, d = 1;
        while(n>0){
            int r = n%10;
            ans += r*d;
            d *= b;
            n /= 10;
        }
        return ans;
    }
    public static int decimalToB(int n, int b){
        int ans = 0, d = 1;
        while(n>0){
            int r = n%b;
            ans += r*d;
            d *= 10;
            n /= b;
        }
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      System.out.print("Enter source base: ");
      int b1 = sc.nextInt();
      System.out.print("Enter target base: ");
      int b2 = sc.nextInt();
      System.out.println(n+" in base "+b2+" = "+bToB(n, b1, b2));
    }
}