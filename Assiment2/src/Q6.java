import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  
	  System.out.print("Enter the number of seconds : ");
	  double t =scn.nextDouble();
	  double g = 32.174;
	  double d =(0.5*g*t*t);
	 
	  System.out.println("Distance travelled : "+d);
	
	}

}
