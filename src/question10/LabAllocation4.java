package question10;

import java.util.Scanner;

public class LabAllocation4 {
	public static void main(String[] args) {
		int x,y,z,n,a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();
		System.out.println("Enter z");
		z=sc.nextInt();
		System.out.println("Enter n");
		n=sc.nextInt();
		  if(n<x&&n<y&&n<z)

	        {

	            if(x<y&&x<z)

	            System.out.println("L1 should be allocated to this class ");

	            else if(y<z)

	            System.out.println("L2 should be allocated to this class ");

	            else

	            System.out.println("L3 should be allocated to this class ");

	        }

	        else if(n<x&&n<y)

	        {

	            if(x<y)

	            System.out.println("L1 should be allocated to this class ");

	            else

	            System.out.println("L2 should be allocated to this class ");

	        }

	        else if(n<x&&n<z)

	        {

	            if(x<z)

	            System.out.println("L1 should be allocated to this class ");

	            else

	            System.out.println("L3 should be allocated to this class ");

	        }

	        else if(n<y&&n<z)

	        {

	            if(y<z)

	            System.out.println("L2 should be allocated to this class ");

	            else

	            System.out.println("L3 should be allocated to this class ");

	        }

	        else if(n<x)

	        System.out.println("L1 should be allocated to this class ");

	        else if(n<y)

	        System.out.println("L2 should be allocated to this class ");

	        else if(n<z)

	        System.out.println("L3 should be allocated to this class ");

	        else

	        System.out.println("None of the labs can be allocated ");

	    }
}


