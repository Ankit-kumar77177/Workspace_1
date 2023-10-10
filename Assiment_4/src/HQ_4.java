import java.util.*;
public class HQ_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a= sc.nextInt();
        int sum=0;
        int sum1=1;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                sum+=i;
            }
           else {
                sum1*=i;
            }
        }
        System.out.println("Sum of all even numbers is "+sum+"\nProduct of all odd numbers is "+sum1);
	}

}
