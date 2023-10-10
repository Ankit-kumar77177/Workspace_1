import java.util.Scanner;
public class Q_3 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a no.");
	        int a= sc.nextInt();
	        int max=a;
	        int min=1;
	        int i=1;
	        double sum=0;
	        do {
	            int b = (int) (Math.random() * max) + min;
	            System.out.println("random values generated  are   "+b+"  ");
	            i++;
	             sum+=b;
	        }while(i<=a);
	        double avg=sum/a;
	        System.out.println("\n\naverage of "+a+" random nos. are "+avg);
		
	}

}
