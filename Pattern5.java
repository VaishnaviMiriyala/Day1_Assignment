package m1.task2;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String args[]) {
		int n;
		System.out.println("Enetr the value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		 int i, j, k = 0;
	        for (i = 1; i <= n; i++){
	            for (j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            while (k != (2 * i - 1)) {
	                if (k == 0 || k == 2 * i - 2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                k++;
	                ;
	            }
	            k = 0;
	            System.out.println(); 
	        }
	        for (i = 0; i < 2 * n - 1; i++) {
	            System.out.print("*");
	        }
	    
	}

}
