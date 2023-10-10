import java.util.*;
public class Q_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.: ");
		int n=sc.nextInt();
		int i =1;
		double series,sum=0;
		for(i=1;i<=n;i++) {
			series=1/Math.pow( i, 2);
			sum+=series;
		}
        System.out.println(sum);
	}

}
