package question1;
import java.util.Scanner;
public class Compare2Integers {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b) {
			System.out.println(a+" is less than "+b);
		}
		else {
			System.out.println(a+" is equal to "+b);
			
		}
		
	}

}
