import java.util.Scanner;
public class HQ2 {

	public static void main(String[] args) {
		int egg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of eggs : ");
		egg = sc.nextInt();
		int gross = egg/144;
		int r = egg % 144;
		int dozen = r/12;
		r = r% 12;
		System.out.println(gross + " gross " + dozen+" dozen, and "+r);
	}

}
