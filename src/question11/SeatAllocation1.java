package question11;
import java.util.Scanner;
public class SeatAllocation1 {
	public static void main(String[] args) {
		int row,column,rollno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows\n");
		row=sc.nextInt();
		System.out.println("Enter the number of columns\n");
		column=sc.nextInt();
		System.out.println("Enter the roll number of the student\n");
		rollno=sc.nextInt();
		if(rollno<=column||rollno%column==1||rollno%column==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
	}

}
