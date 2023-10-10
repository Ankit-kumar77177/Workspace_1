import java.util.*;
public class Q_3 {

	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	          
	        int a, b, i, j, f;
	 
	        System.out.printf("Enter the first number: ");
	        a = sc.nextInt();  
	        System.out.printf("Enter the second number: ");
	        b = sc.nextInt();  
	        System.out.printf("\nPrime numbers between %d and %d are: \n", a, b);
	 
	        for (i = a; i <= b; i++) {
	 
	            if (i == 1 || i == 0)
	                continue;
	            f = 1;
                for (j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    f = 0;
	                    break;
	                    }
	            }
	            if (f == 1)
	                System.out.println(i);
	        }
	    }
}  	 
	


