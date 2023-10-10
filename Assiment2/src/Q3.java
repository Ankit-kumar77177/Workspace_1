import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		double bp,da,HRA,GP;
		Scanner in =new Scanner (System.in);
		System.out.print("Enter basic Salary : ");
		bp = in.nextDouble();
		da = 40.0/100.0*bp;
		HRA = 20.0/100.0*bp;
		GP = (bp +da+HRA);
		System.out.println("DA is " +da);
		System.out.println("HRA is "+HRA);
		System.out.println("Gross Salary : "+GP);
		

	}

}
