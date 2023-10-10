import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter 1st no: ");
	        int x=sc.nextInt();
			 System.out.print("Enter 2nd no: ");
            int y=sc.nextInt();
	        int temp;
	        while (y!=0){
	            temp=y;
	            y=x%y;
	            x=temp;

	        }
	        System.out.println("GCD of 1st and 2nd no is = "+x);
	         
	}

}
