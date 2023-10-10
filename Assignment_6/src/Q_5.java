
	import java.util.*;
	public class Q_5 
	{
		public static double area(int n, double side)
		{
			double Area = (n*Math.pow(side, 2))/4*Math.tan(Math.PI/n);
			return Area;
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of sides of polygon:  ");
			int n = sc.nextInt();
			System.out.println("Enter side length: ");
			double side = sc.nextDouble();
			System.out.println("Area of polygon is: "+ area(n,side));
		}

	}


