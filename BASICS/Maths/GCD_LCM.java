/* 
    
a = 36, b = 24
GCD = 12
LCM = 72

*/

import java.util.Scanner;

class GCD_LCM{
    public static int gcdIterative(int a, int b){

        while(a%b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return b;
    }
    public static int gcdRecursive(int a, int b){
        if(a%b == 0)
            return b;
        return gcdRecursive(b, a%b);
    }
    public static int lcm(int a, int b){
        return (a*b)/gcdIterative(a, b);
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a = sc.nextInt();
      System.out.print("Enter b: ");
      int b = sc.nextInt();
      System.out.println("GCD of "+a+" and "+b+" = "+gcdIterative(a, b)+" , "+gcdRecursive(a, b));
      System.out.println("GCD of "+a+" and "+b+" = "+lcm(a, b));
    }
}