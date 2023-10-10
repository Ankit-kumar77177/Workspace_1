
	import java.util.*;
	public class Q_8 
	{
		public static boolean palindrome(String str)
		{
			int l=str.length();
			String s="";
			for(int i=1;i<=l;i++)
			{
				s = s+str.charAt(l-i);
			}
			if(s.equals(str)==true)
				return true;
			else
				return false;
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println(str + (palindrome(str)?" is ":" is not ")+ " palindrome. ");
		}

	}


