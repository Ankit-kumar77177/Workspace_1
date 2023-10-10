import java.util.*;
public class Q_9 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int x = 0;
	        int newNum = 0;
	        int i = n;
	        while (i != 0) {
	            int d = i % 10;
	            if (d != 0) {
	                newNum += (int)(d * Math.pow(10, x));
	                x++;
	            }
	            i /= 10;
	        }

	        System.out.println("Original number = " + n);
	        System.out.println("New number = " + newNum);
	}

}
