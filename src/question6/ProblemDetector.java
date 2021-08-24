package question6;

import java.util.Scanner;

public class ProblemDetector {
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year Of Birth");
		a=sc.nextInt();
		System.out.println("Enter Current Year");
		b=sc.nextInt();
		if(b>a) {
			c=b-a;
		}
		else if(b<a) {
			c=(b+100)-a;
			
		}
		System.out.println("Your age is " +c);
		
		}
		


}
