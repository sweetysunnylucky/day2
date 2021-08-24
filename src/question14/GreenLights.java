package question14;
import java.util.Scanner;
public class GreenLights {
	public static void main(String[] args) {
		float s,d,t,speed,time;
		Scanner sc=new Scanner(System.in);
		s=sc.nextFloat();
		d=sc.nextFloat();
		t=sc.nextFloat();
		speed=s/3600;
		time=d/speed;
		if(t>time) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
