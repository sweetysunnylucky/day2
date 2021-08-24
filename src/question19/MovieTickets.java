package question19;
import java.util.Scanner;
public class MovieTickets {
	public static void main(String[] args) {
		int age;
		double time1=13.30;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter show timing");
		double time=sc.nextDouble();
		if(age>13) {
			if(time==time1) {
				System.out.println("The ticket price is $5");
			}
			else {
				System.out.println("The ticket price is $8");
			}
		}
		else {
			if(time==time1) {
				System.out.println("The ticket price is $2");
			}
			else {
				System.out.println("The ticket price is $4");
			}
			
		}
		
		
	}

}
