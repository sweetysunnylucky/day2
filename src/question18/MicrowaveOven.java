package question18;
import java.util.Scanner;
public class MicrowaveOven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int a=sc.nextInt();
		System.out.println("Enter the single item heating time");
		float b=sc.nextFloat();
		if(a==2) {
			System.out.println("The recommended heating time is "+(b+(0.5*b)));
		}
		else if(a==3) {
			System.out.println("The recommended heating time is "+(2*b));
		}
		else {
			System.out.println("Number of items is more");
		}
	}

}
