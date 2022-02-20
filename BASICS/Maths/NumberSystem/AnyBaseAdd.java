/*

for base = 8, n1 = 236, n2 = 754

(236)base8 + (754)base8 = (1212)base8

*/

import java.util.Scanner;   

class AnyBaseAdd{
    public static int anyBaseAdd(int n1, int n2, int b){
        int sum = 0, c = 0, p = 1;
        while(n1 > 0 || n2 > 0){
            int t = (n1>0?n1%10:0) + (n1>0?n2%10:0) + c;
            sum += (t%b)*p;
            c = t/b;
            n1 /= 10;
            n2 /= 10;
            p *= 10;
        }
        return c != 0 ? sum + c*p : sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nt number: ");
        int n2 = sc.nextInt();
        System.out.println(n1+" + "+n2+" in base("+b+") = "+anyBaseAdd(n1, n2, b));
    }
}