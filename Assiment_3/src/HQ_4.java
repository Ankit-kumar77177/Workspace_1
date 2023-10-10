import java.util.Scanner;
public class HQ_4 {

	public static void main(String[] args) {
		 
		Scanner aj = new Scanner(System.in);	 
		System.out.print("Enter an integer: ");
		int number = aj.nextInt();
		System.out.println("Is 10 divisible by 5 and 6? " +
			((number % 5 == 0) && (number % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6? " +
			((number % 5 == 0) || (number % 6 == 0)));
		System.out.println("Is 10 divisible by 5 of 6, but not both? " +
			((number % 5 == 0) ^ (number % 6 == 0)));

	}

}
