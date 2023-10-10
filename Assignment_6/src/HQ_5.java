import java.util.Scanner;
public class HQ_5 {
	
	    public static boolean isConsecutive(int n1, int n2, int n3) 
	    {
	    	if((n2-n1)==1 || (n3-n2)==1)
	    		return true;
	    	else
	    		return false;
	    }
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first, second and third number respectively: ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			System.out.println("Check whether the three said numbers are consecutive or not! "+ isConsecutive(n1, n2, n3) );

		}

	}


