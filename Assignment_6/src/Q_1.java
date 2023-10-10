import java.util.Scanner;
public class Q_1 {
	
			public static int additionSimple(int x, int y)
			{
				
				int add = x+y;
				return add;
				
			}
			public static int subtractionSimple(int x, int y)
			{
				
				
				int diff = x-y;
				return diff;
				
			}
			public static int multiplicationSimple(int x, int y)
			{
				int prod = x*y;
				return prod;
			}

			public static double divisionSimple(int x, int y)
			{
				double div =0;
				if(x!=0)
				  div = x/y;
				return div;
			}
			public static int remainderSimple(int n, int m)
			{
				
				int rem = n%m;
				return rem;
			}
			public static double squareRootSimple(int n)
			{
				    double sqrt=0;
					if(n>0)
					{
					 sqrt = Math.sqrt(n);
					 
					}
					else 
					 System.out.println("Number is not positive");
					return sqrt;
					
			}
			public static void main(String[] args)
			{
				Scanner obj = new Scanner(System.in);	
				System.out.println("1.Addition \t 2.Subtraction \t 3.Multiplication "
						+ "\n 4.Division \t 5.Remainder \t 6.SquareRoot");
				System.out.println("Enter choice: ");
				int ch = obj.nextInt();
				switch(ch)
				{
				 case 1:
				{
					 System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println("Enter y: ");
					 int y =obj.nextInt();
					 System.out.println(additionSimple(x, y));
					 break;
					 
				}
				case 2:
				{
					 System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println("Enter y: ");
					 int y =obj.nextInt();
					 System.out.println(subtractionSimple(x, y));
					 break;
				}
				case 3:
				{
					System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println("Enter y: ");
					 int y =obj.nextInt();
					 System.out.println(divisionSimple(x, y));
					 break;
				}
				case 4:
				{
					 System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println("Enter y: ");
					 int y =obj.nextInt();
					 System.out.println(divisionSimple(x, y));
					 break;
				}
				case 5:
				{
					System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println("Enter y: ");
					 int y =obj.nextInt();
					 System.out.println(divisionSimple(x, y));
					 break;
				}
				case 6:
				{
					System.out.println("Enter x: ");
					 int x =obj.nextInt();
					 System.out.println(squareRootSimple(x));
					 break;
					 
				}
				default:
					System.out.println("Wrong Choice");
			
			}

	}

}
