import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year : True");
        }
        else
        {
            System.out.println(year + " is a leap year : False");
        }
    }

	}


