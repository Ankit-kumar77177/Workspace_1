import java.util.Scanner;

public class Q_3 {
	public static int reverse(int n) {
		int t = 0, rev = 0;
		while (n > 0) {
			t = n % 10;
			rev = rev * 10 + t;
			n = n / 10;
		}

		return rev;

	}

	public static boolean isPalindrome(int n) {
		if (reverse(n) == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println(number + (isPalindrome(number) ? " is" : " is not") + " a palindrome number.");
	}

}
