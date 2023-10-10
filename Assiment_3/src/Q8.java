import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the x and y coordinates of the point:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("The point is in  I quadrant.");
		} else if (x < 0 && y > 0) {
			System.out.println("The point is in  II quadrant");
		} else if (x < 0 && y < 0) {
			System.out.println("The point is in  III quadrant.");
		} else if (x > 0 && y < 0) {
			System.out.println("The point is in  IV quadrant.");
		} else if (x!=0 && y == 0) {
			System.out.println("The point is in X-axis.");
		}
			else if (x==0 && y!=0) {
				System.out.println("The point is in Y-axis.");
		} else {
			System.out.println("The point is on origin.");
		}
	}
}
