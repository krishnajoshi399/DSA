import java.util.Scanner;

class Fibo{

/*
 Displays till nth fibonacci no's
 Complexity: O(n)T / O(1)S
 */

    public static void fibo(int n){
        int a = 0, b = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }    
    }

/*
Recursive solution
Complexity: O(2*n)T / O(log(n))S
*/
    public static int fiboNth(int n){
        if(n==1 || n==2)
            return n-1;
        return fiboNth(n-1)+fiboNth(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fibo(n);
        System.out.println("\n"+fiboNth(n));
    }
}