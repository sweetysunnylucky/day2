package question7;

import java.util.Scanner;

public class LabAllocation1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		if(a<b && a<c) {
			System.out.println("L1 has has the minimal seating capacity");
		    }
		else if(b<a && b<c) {
		    System.out.println("L2 has the minimal seating capacity");
		    }
		else {
			System.out.printf("L3 has the minimal seating capacity");
		}
		
		
	}

}
