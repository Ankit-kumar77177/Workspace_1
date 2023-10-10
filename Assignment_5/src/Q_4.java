import java.util.*;
public class Q_4 {

	public static void main(String[] args) {
 		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter the value of m: ");
		        int m = in.nextInt();
		        System.out.print("Enter the value of n: ");
		        int n = in.nextInt();

		        if (m < n && m > 0 && n > 0) {
		            for (int i = m; i <= n; i++) {
		                long fact = 1;
		                for (int j = 1; j <= i; j++)
		                    fact *= j;
		                System.out.println("Factorial of " + i + " is = " + fact);
		            }
		        }
		        else {
		            System.out.println("Invalid Input");
		        }

	}

}
