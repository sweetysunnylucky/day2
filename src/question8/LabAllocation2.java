package question8;
import java.util.Scanner;


public class LabAllocation2 {
	public static void main(String[] args) {
		int a,b,c;
		String lab;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		System.out.println("Enter the lab allocated for ACE training");
		lab=sc.next();
		if(lab.equals("L1")) {
			if(b<c) {
			   System.out.println("L2 has the minimal seating capacity");
			}
			else {
				System.out.println("L3 has the minimal seating capacity");
			}
		}
		else if(lab.equals("L2")) {
				if(a<c) {
				   System.out.println("L1 has the minimal seating capacity");
				}
				else {
					System.out.println("L3 has the minimal seating capacity");
				}
		}
		else if(lab.equals("L3")) {
					if(a<b) {
					   System.out.println("L1 has the minimal seating capacity");
					}
					else {
						System.out.println("L2 has the minimal seating capacity");
					}
			}
	}
}
	


