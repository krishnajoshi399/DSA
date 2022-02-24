/*

print prime no's till 'n' = 20
2 3 5 7 11 13 17 19

Time complexity of below program = O(n*log(log(n)))
Space complexity of below program = O(n)

*/

import java.util.Scanner;

class SieveOfEratosthenes{
    public static void sieveOfEratosthenes(int n){

        boolean[] prime = new boolean[n+1];

        for(int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i)
                prime[j] = true;
        }
        for(int i=2;i<=n;i++)
            if(!prime[i])
            System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sieveOfEratosthenes(n);
    }
}