import java.util.*;
public class Q_8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int i,j=1,l=0;
		for(i=1;i<=n;i++)
		{
			j+=(l+i);
			l++;
			
		}
		System.out.println("sum = "+j);
		
	}

}
