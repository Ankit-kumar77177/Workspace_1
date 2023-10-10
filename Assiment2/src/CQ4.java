
public class CQ4 {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		 t = Math.toRadians(90);
		double val = Math.cos(5*t)+Math.sin(7*t);
		System.out.println("val " + val);

	}

}
