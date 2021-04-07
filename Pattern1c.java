package m1.task2;
import java.util.Scanner;
public class Pattern1c {

	public static void main(String[] args) {
		int number;
		System.out.println("Enetr the value");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.close();
		int count = 1,count1 = 2;
		for(int i = 0;i < number;i++) {
			for(int j = 0;j <= i;j++) {
				if(i % 2 == 0) {
					System.out.print(count+" ");
					count = count + 2;
				}else{
					System.out.print(count1+" ");
					count1 = count1 + 2;
				}
			}
			System.out.println();
		}

	}

}
