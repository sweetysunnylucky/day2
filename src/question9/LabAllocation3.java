package question9;

import java.util.Scanner;

public class LabAllocation3 {
	public static void main(String[] args) {
		int x,y,z,n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();
		System.out.println("Enter z");
		z=sc.nextInt();
		System.out.println("Enter n");
		n=sc.nextInt();
		if(n<=x && n<=y &&n<=z) {
			System.out.println("3 lab(s) can accommodate "+n+" students");
		}
		else if((n<=x && n<=y)||(n<=x && n<=z)||(n<=y && n<=z)){
			System.out.println("2 lab(s) can accommodate "+n+" students");
		}
		else if(n<=x||n<=y||n<=z) {
			System.out.println("1 lab(s) can accommodate "+n+" students");
		}
		else {
			System.out.println("None of the lab(s) can accommodate "+n+" students");
		}
	}

}
