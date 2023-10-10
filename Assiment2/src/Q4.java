import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
	int n , r , sum = 0;
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number between 0 and 1000 : ");
	n=sc.nextInt();
	r=n%10;
	n=n/10;
	sum=sum+r;
	r=n%10;
	n=n/10;
	sum=sum+r+n;
	System.out.println("The sum of the \n"+"digit is " +sum );

	}

}
