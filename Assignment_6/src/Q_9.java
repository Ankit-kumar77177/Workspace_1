
import java.util.Scanner;

public class Q_9 {
	public static boolean validPassword(String password) {
		boolean isvalid = leastCharacters(password) && onlyLettersAndDigits(password) && atleastdigits(password);
		return isvalid;
	}

	public static boolean leastCharacters(String password) {
		if (password.length() >= 8 == true)
			return true;
		else
			return false;
	}

	public static boolean onlyLettersAndDigits(String password) {
		int l = password.length();
		for (int i = 0; i < l; i++) {
			int c = password.charAt(i);
			if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c > 48 && c <= 57))
				return true;

		}
		return false;
	}

	public static boolean atleastdigits(String password) {
		int l = password.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			int c = password.charAt(i);
			if (c >= 48 && c <= 57)
				count++;
		}
		if (count >= 2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = sc.nextLine();
		System.out.println(password + (validPassword(password) ? " is " : " is not ") + " a valid password ");

	}

}
