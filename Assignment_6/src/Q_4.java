
public class Q_4 
{
	public static int numberOfDaysInAYear(int year)
	{
		if(year%4==0 && (year%400==0 || year%100!=0))
			return 366;
		else
			return 365;
	}
	public static void main(String[] args) 
	{
		for(int i=2000;i<2025;i++)
			System.out.println("Number of days in year "+ i + " is "+ numberOfDaysInAYear(i));
	}

}


