import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner scn =  new Scanner (System.in);
		System.out.print("Enter the distance between two cities in km :");
		int d = scn.nextInt();
		int m = d*1000;
		System.out.println(d+ " km is " +m+ " Meters ");
		double cm , inch , feet; 
		cm   = d * 100000;
		feet = d * 3280.8399;
		inch = d * 39370.0787;
		System.out.println(d+" km is "+cm+ " centimeters");
		System.out.println(d+" km is "+feet+ " feet");
		System.out.println(d+" km is "+inch+ " inch");
	}

}
