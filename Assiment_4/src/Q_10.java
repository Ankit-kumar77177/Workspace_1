import java.util.*;
public class Q_10 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print(" Enter a number: ");
	        int n = sc.nextInt();
	        int lp = 1;
	        while (lp <= n)
	        {
	            lp *= 3;
	        }
	        lp=lp/3;
	        System.out.println(" The largest power of 3 less than or equal to " + n + " is " +lp);
	                sc.close();

	}

}
