import java.util.Scanner;
public class Q_6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a base: ");
	        int x=sc.nextInt();
	        System.out.print("Enter the power: ");
	        int y=sc.nextInt();
	        int a=1;
	        for(int i=1;i<=y;i++){
	             a=a*x;
	        }
	        System.out.println(x+" to the power "+y+" is "+a);
	}

}
