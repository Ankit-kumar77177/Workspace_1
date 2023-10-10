import java.util.Scanner;
public class Q1 {

	public static void main(String[] args)
	{
		double f , c;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit : ");
		f = scnr.nextDouble();
		c = (f -32)*(5.0/9);
		System.out.println(f+ "Fahrenheit is "+c+ "celsius");

	}

}
