import java.util.Scanner;
public class HQ_1 {

	public static void main(String[] args) {
		 final Scanner SCANNER = new Scanner(System.in);
	        int computer = (int) (Math.random() * 3);
	        System.out.print("scissor (0), rock (1), paper (2): ");
	        int player = SCANNER.nextInt();
	        String msg1 = "The computer is ";
	        String msg2 = "You are ";
	        String msg3;
	        switch (computer) {
	            case 0:
	                msg1 += "scissor. ";
	                break;
	            case 1:
	                msg1 += "rock. ";
	                break;
	            case 2:
	                msg1 += "paper. ";
	                break;
	        }
	        switch (player) {
	            case 0:
	                msg2 += "scissor";
	                break;
	            case 1:
	                msg2 += "rock";
	                break;
	            case 2:
	                msg2 += "paper";
	                break;
	        }
	        if (computer == player) {
	            msg2 += " too. ";
	            msg3 = "It is a draw";
	        } else if (player == computer + 1 || player == computer - 2) 
	        {
	            msg2 += ". ";
	            msg3 = "You won";
	        } else {
	            msg2 += ". ";
	            msg3 = "You lost";
	        }
	        System.out.println(msg1 + msg2 + msg3);

	}

}
