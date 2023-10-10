import java.util.Scanner;
public class HQ_1 {
	    public static char firstNonRepeatedCharacter(String str)
	    {
	    	int l = str.length();
	    	int count;
	    	String strnew="";
	    	for( int i=0;i<l;i++)
	    	{
	    		count =0;
	    		for (int j=0;j<l;j++)
	    		{
	    			if(str.charAt(i)== str.charAt(j))
	    			{
	    				count++;
	    			}
	    		}
	    		if(count == 1)
	    			strnew = strnew+str.charAt(i);
	    	}
	    	return strnew.charAt(0);
	    }
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("The first non-repeated character in the given string "+ str + " is "+ firstNonRepeatedCharacter(str));
		}

}


