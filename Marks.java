package m1.task1;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		int englishmarks,java,db,springtool;
		System.out.println("Enter the Marks:");
		Scanner sc = new Scanner(System.in);
		englishmarks = sc.nextInt();
		java = sc.nextInt();
		db = sc.nextInt();
		springtool = sc.nextInt();
		sc.close();
		int total_marks = englishmarks + java+ db + springtool;
		int avg_marks = (total_marks)/4;
		System.out.println("Total Marks :"+total_marks);
		System.out.println("Average Marks :"+avg_marks);

	}

}
