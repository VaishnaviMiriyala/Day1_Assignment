package m1.task1;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		double basicSalary;
		System.out.println("Enter the Baisc Salary value:");
		Scanner sc = new Scanner(System.in);
		basicSalary = sc.nextInt();
		sc.close();
		double hra = basicSalary * 0.4;
		double da = (0.6 * (basicSalary + hra));
        double tax = 0;
        if(basicSalary < 200000) {
        	tax = 0;
        }else if(basicSalary >= 200000 && basicSalary < 600000){
        	tax = 0.1* basicSalary;
        }else {
        	tax = 0.2 * basicSalary;
        }
        double totalSalary = (basicSalary + hra + da) - tax;
        double annualSalary = totalSalary * 12;
        System.out.println("Basic Salary:"+basicSalary+"\nHra:"+hra+"\nDA:"+da+"\nTotal Salary:"+totalSalary+"\nAnnual Salary:"+annualSalary);
	}

}
