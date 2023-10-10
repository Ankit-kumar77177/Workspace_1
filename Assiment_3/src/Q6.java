import java.util.*;
public class Q6 {

	public static void main(String[] args) 
		   {

		 Scanner Sc = new Scanner(System.in);
		 System.out.print("Enter the units consumed : ");
		 int units = Sc.nextInt();

		 double bill = 0;

	       if(units <= 50) {

	           bill = 3* units;
	       }

	       else if(units >= 50 && units <= 200)

	       {

	            bill = 3 * 50 + 4.80 * (units-50);

	       }
	       
	       else if(units >= 200 && units <= 400)
	    	   
	       {
	    	    bill = 3 * 50 + 4.80 *150 +5.80 * (units-200);
	       }
	       
	       if(units >= 400)
	       {
	    	    bill = 3 * 50 + 4.80 *150 +5.80 * 200 + 6.20 * (units -400);
	       }
	       System.out.print("Bill = " +  bill);

	   }
   }
