import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c, sum=0;
		System.out.print("Enter 1st no: ");
		a=sc.nextInt();
		System.out.print("Enter 2nd no: ");
		b=sc.nextInt();
		System.out.print("Enter 3rd no: ");
		c=sc.nextInt();
		for (int i=a; i<=b; i+=c) {
			System.out.print(i+" ");
			sum +=i;	 
		}
		System.out.println("\n"+"The sum of no. displayed is "+sum );
		sum= sum+a;
	}

}
