import java.util.Scanner;
public class hq1sir {

	public static void main(String[] args) {
		 
				    Scanner aj  = new Scanner(System.in);
			        int computer = (int) (Math.random() * 3);
			        System.out.print("scissor (0), rock (1), paper (2): ");
			        int  user = aj.nextInt();
			        System.out.print("The Computer is ");
			         
			        switch(computer) { 
			        
			        case 0 : System.out.print(" Scissor "); break;
			        case 1 : System.out.print(" Rock "); break;
			        case 2 : System.out.print(" Paper "); break;
			        }
			        System.out.print(" You are ");
					switch(user)
			        {
			        case 0: System.out.print(" Scissor ");break;
			        case 1: System.out.print(" Rock "); break;
			        case 2: System.out.print(" Paper "); break;
			        }
					if (user == computer)
					
					System.out.print("It is a Draw ");
					
					else if ((user == 0 && computer == 2) ||
						     (user == 1 && computer == 0) ||
						     (user == 2 && computer == 1)) {
					System.out.print(" you won ");
					}
					else 
						System.out.println(" computer won ");
	}
}
