
public class HQ_2 {

	public static void main(String[] args) {
		 int n=1000;
	        int sum=0;
	        for(int i=1;i<n;i++) {
	            if((i*3)<=n) {
	                sum += (i * 3);
	            }
	            if ((i*5)<n) {
	                sum +=  (i * 5);
	            }
	        }
	        System.out.println("The sum of the multiples of 3 and 5 below 1000 is "+sum);
	}

}
