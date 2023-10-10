import java.util.Scanner;
public class HQ_5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("What is your gender (m or f) :");
	        char gender = sc.next().charAt(0);
	        System.out.print("First Name : ");
	        String fname  = sc.next();
	        System.out.print("Last Name : ");
	        String lname  = sc.next();
	        System.out.print("Age : ");
	        int age = sc.nextInt();
	        
	        
	        if (gender == 'f'){
	            if (age >=20){
	            System.out.print("Are you married, "+ fname + " (y /n) ?");
	            char ans = sc.next().charAt(0);
	            if (ans == 'y')
	                System.out.println("Then I shall call you Mrs." + fname + " " + lname);
	            else
	                System.out.println("Then I shall call you Ms." + fname + " " + lname);
	            }
	            else
	                System.out.println("Then I shall call you " + fname + " " + lname);
	        }
	        else if (gender == 'm'){
	            if (age >= 20)
	            System.out.println("Then I shall call you Mr." + fname + " " + lname);
	            else
	            System.out.println("Then I shall call you " + fname + " " + lname);
	          }
	    
	}

}
