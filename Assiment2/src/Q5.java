import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		double VH , SH , A , R , PIE ;
		System.out.println("Enter radius ");
		Scanner scn = new Scanner(System.in);
		R = scn.nextDouble();
		PIE = 3.14159265358973238;
		SH  =(R*R*3*PIE);
		VH  =(R*R*R*PIE*2/3);
		System.out.println(" The surface area of the hemisphere is "+SH);
		System.out.println(" The volume of a hemisphere is "+VH);
		
	}

}
