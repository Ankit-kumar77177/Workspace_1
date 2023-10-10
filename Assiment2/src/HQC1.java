
public class HQC1 {

	public static void main(String[] args) {
		double rate = Double.parseDouble(args[0]);
		double principle = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		
		double SI = (principle * time * rate)/100;
		System.out.println("simple intrest is "+SI);
		}

}
