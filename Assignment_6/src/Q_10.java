
	import java.util.Scanner;
	public class Q_10 
	{
	    public static double areaOfTriangle(int b, int h)
	    {
	    	double area = 1/2*b*h;
	    	return area;
	    }
	    public static double areaOfSquare(int side)
	    {
	    	double area = side*side;
	    	return area;
	    }
	    public static double areaOfCircle(int r)
	    {
	    	double area = Math.PI*Math.pow(r, 2);
	    	return area;
	    }
	    public static double areaOfRectangle(int length,int breadth)
	    {
	    	double area = length*breadth;
	    	return area;
	    }
	    
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Triangle \t 2.Square \t 3.Circle \t 4.Rectangle");
			System.out.println("Enter choice: ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter base and height respectively: ");
				int b = sc.nextInt();
				int h = sc.nextInt();
				System.out.println("Area of triangle is "+ areaOfTriangle(b,h) );
				break;
			}
			case 2:
				{
				   System.out.println("Enter side: ");
			       int side = sc.nextInt();
				   System.out.println("Area of square is "+ areaOfSquare(side));
				   break;
				}
			case 3:
			{
				System.out.println("Enter radius: ");
				int r = sc.nextInt();
				System.out.println("Area of circle is "+ areaOfCircle(r));
				break;
			}
			case 4:
			{
				System.out.println("Enter length and breadth respectively: ");
				int length = sc.nextInt();
				int breadth = sc.nextInt();
				System.out.println("Area of rectangle is: "+ areaOfRectangle(length,breadth) );
				break;
			}
			}
		}

	}


