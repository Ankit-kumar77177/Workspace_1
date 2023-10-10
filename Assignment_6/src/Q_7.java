
	import java.util.Scanner;
	public class Q_7
	{
		public static int count(String str)
		{
			int l = str.length();
			String v = "aeiouAEIOU";
			int p=v.length();
			int count=0;
			for(int i=1;i<l;i++)
			{
				for(int j=1;j<p;j++)
				{
					if(str.charAt(i)==v.charAt(j))
						count++;
				}
			}
			return count;
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("Number of vowels in string "+ str +" is "+ count(str));
		}

	}


