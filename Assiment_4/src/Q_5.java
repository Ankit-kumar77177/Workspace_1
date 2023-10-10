import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number : ");
	        int x=sc.nextInt();
	       int sum=0;
	        int i;
	        for( i=1;i<x;i++){
	            if(x%i==0){
	                sum+=i;

	                }
	            }
	        if (sum==x){
	            System.out.print(x+" is a perfect number ");
	        }
	        else{
	            System.out.println(x+" is not a perfect number. ");
	        }

	}

}
