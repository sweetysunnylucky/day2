package question4;

import java.util.Scanner;

public class FruitSeller {
	public static void main(String[] args) {
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of dozen mangoes");
		a=sc.nextFloat();
		System.out.println("Enter the price at which 1 mango is being sold");
		b=sc.nextFloat();
		c=(b*12);
		if(a==c) {
			System.out.println("No profit nor loss");
			}
		else if(a>c) {
		    System.out.printf("Loss:Rs.%.2f\n",+(a-c));
		    }
		else {
			System.out.printf("Profit:Rs.%.2f\n",+(a+c));
		}
		
		
	}


}
