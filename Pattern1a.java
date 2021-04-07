package m1.task2;
import java.util.Scanner;
public class Pattern1a {

	public static void main(String[] args) {
		int number;
		System.out.println("Enetr the value");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.close();
		for(int i = 0;i < number;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
