import java.util.Scanner;
public class HQ_2 {
		
	    public static double volumeOfCube(int side)
	    {
	    	double volume = Math.pow(side, 3);
	    	return volume;
	    }
	    public static double volumeOfCuboid(int length, int breadth, int height)
	    {
	    	double volume = length*breadth*height;
	    	return volume;
	    }
	    public static double volumeOfSphere(int radius)
	    {
	    	double volume = 4/3*Math.PI*Math.pow(radius, 2);
	    	return volume;
	    }
		public static void main(String[] args)
		{
			
	       Scanner sc = new Scanner(System.in);
	       System.out.println("1.Cube \t 2.Cuboid \t 3.Sphere");
	       System.out.println("Enter choice: ");
	       int ch = sc.nextInt();
	       switch(ch)
	       {
	       case 1:
	       {
	    	   System.out.println("Enter side: ");
	    	   int side = sc.nextInt();
	    	   System.out.println("Volume of cube is "+ volumeOfCube(side));
	    	   break;
	       }
	       case 2:
	       {
	    	   System.out.println("Enter length, breadth and height respectively: ");
	    	   int length = sc.nextInt();
	    	   int breadth = sc.nextInt();
	    	   int height = sc.nextInt();
	    	   System.out.println("Volume of Cuboid is "+ volumeOfCuboid(length,breadth,height));
	    	   break;
	       }
	       case 3:
	       {
	    	   System.out.println("Enter radius: ");
	    	   int radius = sc.nextInt();
	    	   System.out.println("Volume of sphere is "+ volumeOfSphere(radius) );
	    	   break;
	       }
	       default:
	    	   System.out.println("Wrong Choice");
	    	   
	       }
		}

}
