package question5;
import java.util.Scanner;
public class FeeCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student type");
		String str=sc.nextLine();
		System.out.println("Enter tuition fee");
		int a=sc.nextInt();
		System.out.println("Enter bus fee");
		int b=sc.nextInt();
		System.out.println("Enter hostel fee");
		int c=sc.nextInt();
		switch(str) {
		case "MSDS":System.out.println(a+b);break;
		case "MSH":System.out.println(a+c);break;
		case "MGSDS":System.out.println((150*a)/100+b);break;
		case "MGSH":System.out.println((150*a)/100+c);break;  
         }
		
	}

}
