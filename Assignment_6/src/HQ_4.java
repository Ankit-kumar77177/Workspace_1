import java.util.Scanner;
public class HQ_4 {
	
	    public static int numberOfWords(String str)
	    {
	    	int l = str.length();
	    	int count=1;
	    	for(int i=0;i<l;i++)
	    	{
	    		if(str.charAt(i) == ' ')
	    			count++;
	    	}
	    	return count;
	    }
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("Number of words in the string: "+ str + " is "+ numberOfWords(str));
			

		}

	}


