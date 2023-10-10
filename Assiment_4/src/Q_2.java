import java.util.Scanner;
public class Q_2 {

	public static void main(String[] args) {
		Scanner aj = new Scanner(System.in);
		System.out.print("Enter your no : ");
	 	int n =aj.nextInt();
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum+=a;
			n/=10;	
		}
		if (sum % 9 == 0) {
			System.out.println("The no. is divisible by 9");
		}
		else {
			System.out.println("The no. is not divisible by 9");
		}
	}

}
