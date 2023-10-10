import java.util.Scanner;

public class HQ_3 {
		    public static char middleCharacter(String str)
	    {
	    	int l = str.length();
	    	if(l%2==0)
	    		return str.charAt(l/2);
	    	else
	    		return str.charAt((l-1)/2);
	    }
		public static void main(String[] args)
		{
			
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a string: ");
	       String str = sc.nextLine();
	       System.out.println("Midlle character of the given string "+ str + " is " + middleCharacter(str) );
		}

	}


