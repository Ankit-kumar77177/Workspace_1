import java.util.*;
public class Q_7 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a no. for multiplication table: ");
	        int n=sc.nextInt();
	        int sum=0;
	        for (int i = 1; i <= 10; i++) {
	            sum=n*i;
	            System.out.println(n + "X" + i + "=" + sum);
	        }

	}

}
