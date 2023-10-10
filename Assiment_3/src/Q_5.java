import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();
        boolean result ;
        if (year % 4 == 0 && (year % 100!=0 || year % 400 == 0 ))
        	result = true;
        else
        	result = false;
        System.out.println(year +" is a leap year : "+ result);

	}

}
