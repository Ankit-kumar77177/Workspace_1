import java.util.Scanner;
public class QH1 {

	public static void main(String[] args) {
		double year , minute, day;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of minutes: ");
		minute = sc.nextDouble();
		
		year =minute/525600;  			// 525600 = 365*24*60
		year =(int)year;
		
		day = (minute - year*525600)/(24*60);
		day = (int)day;
		
		System.out.println("There are " + year +" years, "+ day +" days");
		
		
		

	}

}
