package question12;

import java.util.Scanner;

public class SeatAllocation2 {
	public static void main(String[] args) {
		int row,column,rollno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows\n");
		row=sc.nextInt();
		System.out.println("Enter the number of columns\n");
		column=sc.nextInt();
		System.out.println("Enter the roll number of the student\n");
		rollno=sc.nextInt();
		if(rollno<=row||rollno%row==1||rollno%row==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
	}


}
