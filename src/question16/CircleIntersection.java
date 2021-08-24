package question16;

import java.util.Scanner;

public class CircleIntersection {
	public static void main(String[] args) {
		int a,b,c,x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();
		System.out.println("Enter z");
		z=sc.nextInt();
		int power=(int)(Math.pow((x-a),2)+Math.pow((y-b),2));
		int dis=(int)Math.sqrt(power);
		int rad=z+c;
	    if(dis==rad) {
			System.out.println("The circles are tangential");
		}
	    if(dis>rad) {
			System.out.println("The circles do not overlap");
		}
		else if(dis<rad) 
		{
			System.out.println("The circles overlap");
		}
		
		
	}

}
