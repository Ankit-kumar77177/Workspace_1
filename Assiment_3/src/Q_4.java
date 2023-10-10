import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		System.out.println(" Enter user Number ");
		Scanner sc = new Scanner(System.in);
		int ui = sc.nextInt();
		int cg = (int) (Math.random()*(9-1+1)+1);
		if (ui == cg)
			System.out.println("\" you got it right\"" );
		else if ((ui== cg +1) || (ui == cg-1))
		
		System.out.println("\"almost got it\"");
		else 
			System.out.println("\"you got it wrong\"");

	}

}
