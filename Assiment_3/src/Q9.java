import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
	Scanner aj = new Scanner(System.in);
	 System.out.println("Enter the value of a ,b,c :");
	 int x = aj.nextInt();
	 int y = aj.nextInt();
	 int z = aj.nextInt();
	 if (x>y && x>z)
	 {
		 System.out.println("Largest Number= "+x);
		 if (y<x && y>z)
		 System.out.println("2nd Largest = "+y);
		 else if(z<x && z>x);
		 System.out.println("2nd Largest = "+z);
	 }
	 else if (y>x && y>z){
		 System.out.println("Largest Number= "+y);
		 if (x<y && x>z)
		 System.out.println("2nd Largest = "+x);
		 else if(z<y && z>x)
		 System.out.println("2nd Largest = "+z);
	 }
	 else if (z>x && z>y) {
		 System.out.println("Largest Number= "+z);
		 if (x<z && x>y)
		 System.out.println(" 2nd Largest = "+x);
		 else if(y<z && y>x)
		 System.out.println(" 2nd Largest = "+y);
		 }
	}
}