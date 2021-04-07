package m1.task1;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		int date;
		System.out.println("Enter the date");
		Scanner sc = new Scanner(System.in);
		date = sc.nextInt();
		sc.close();
		if(date % 10 == 1 && date != 11) {
			System.out.println(date+"st");
		}else if (date % 10 == 2 && date != 12) {
			System.out.println(date+"nd");
		}else if(date % 10 == 3 && date != 13) {
			System.out.println(date+"rd");
		}else {
			System.out.println(date+"th");
		}

	}

}
