/*

Identify the below pattern: 

for n = 0, result = 0
for n = 1, result = 1
for n = 2, result = 3
for n = 3, result = 0
for n = 4, result = 4
.
.
.

*/

import java.util.Scanner;
import java.util.Arrays;

class XORtillN{
    public static int xorTillN(int n){
        switch(n%4){
            case 0: return n;
            case 1: return 1;
            case 2: return n+1;
            case 3: return 0; 
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("after XORing = "+xorTillN(n));
    }
}