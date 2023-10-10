
	import java.util.*;
	public class Q_6 
	{
		public static int count(String str, char a)
		{
			int l = str.length();
			int count=0;
			for( int i=0;i<l;i++)
			{
				if(str.charAt(i)== a)
					count++;
				
			}
			return count;
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("Enter a character to be searched: ");
			char a = sc.next().charAt(0);
			System.out.println("No of times character '"+ a + "' is present in string '"+ str +"' is "+ count(str,a));
		}

	}
