import java.util.*;
public class Q_2 {

	public static void main(String[] args) {
		 int n,a,sum=0 ,  b;  
		    Scanner sc = new Scanner(System.in);      
		    System.out.println("Enter the prime number?");  
		    n = sc.nextInt();  
		  
		        while(n!=0)  
		        {  
		         a = n%10;  
		        sum = sum*10 +a;  
		        n= n/10;  
		        }  
		        
		     b = 0;  
		    for (int j = 2; j <= sum / 2; j++)  
		    {  
		        if ((sum % j) == 0)  
		        {  
		             b = 1;  
		            break;  
		        }  
		    }  
		    if ( b == 0)  
		            System.out.println("Twisted Prime");  
		     else  
		            System.out.println("Not Twisted Prime");  

	}

}
