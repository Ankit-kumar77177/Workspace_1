
public class HQC2 {

	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		double Area = (Math.PI*Math.pow(r, 2))+ (2*Math.PI * r*h);
		System.out.println("Area is : "+ Area);
	}

}
