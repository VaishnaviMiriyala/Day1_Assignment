package m1.task2;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		int number;
		System.out.println("Enetr the value");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.close();
		for (int i=1; i<=number; i++){
            for (int j=number; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=number-1; i>=1; i--){
            for (int j=number-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
         
	}

}
