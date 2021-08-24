package question15;

import java.util.Scanner;

public class Budget {
	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		double t=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
		if(t<15000) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}
	
	

}
