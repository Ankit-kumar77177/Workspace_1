import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Input marks of the candidate out of 100 :");
         int m = sc.nextInt();
         int n = m/10;
         switch(n){
         case 9 :
             System.out.println("Grade is O.");break;
         case 8 :
             System.out.println("Grade is A.");
             break;
         case 7 :
             System.out.println("Grade is B.");
             break;
         case 6 :
             System.out.println("Grade is C.");
             break;
         case 5 :
             System.out.println("Grade is D.");
             break;
         case 4 :
             System.out.println("Grade is E.");
             break;
         default :
             System.out.println("Grade if F.");
         }
     }
 }

	


