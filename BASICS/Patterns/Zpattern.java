
/* 

for n = 5

* * * * *
      *
    *
  *
* * * * *

*/


import java.util.Scanner;

class Zpattern{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
      	for(int j=1;j<=n;j++){
      		if(i==1 || i==n)
				System.out.print("* ");
			else if(j==n-i+1)
		        System.out.print("* ");
		    else
        	    System.out.print("  ");
      	}
      	System.out.println();
      }
    }
}