package question13;

import java.util.Scanner;

public class HotelTariffCalculator {
	public static void main(String[] args) {
		int a,b;
		float c,total;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextFloat();
		switch(a) {
		case 1:
		case 2:	
		case 3:
		total=c*b;
		System.out.printf("Hotel Tariff:Rs.%.2f",total);
		break;
		case 4:
		case 5:	
		case 6:
		total=c*b;
		total+=0.2*total;
		System.out.printf("Hotel Tariff:Rs.%.2f",total);
		break;
		case 7:
		case 8:	
		case 9:
		total=c*b;
		System.out.printf("Hotel Tariff:Rs.%.2f",total);
		break;
		case 10:
		case 11:	
		case 12:
		total=c*b;
		total+=0.2*total;
		System.out.printf("Hotel Tariff:Rs.%.2f",total);
		break;
		default:System.out.printf("Invalid Input");
			
		}
		
		
	}

}
