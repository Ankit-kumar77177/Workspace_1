import java.util.*;
public class Q_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int y;
        int x;
        int i;
        do{
            int max=10;
             x=(int)(Math.random()*(max))+1;
             i=x;
            //System.out.println(x);
           y=sc.nextInt();
            if(y==x){
                System.out.println("computer guesses  "+x+"\nuser guesses  "+y+"\ngood guess");
            }
            else if (y<x && y>=1){
                System.out.println("computer guesses  "+x+"\nuser guesses  "+y+"\nToo low, try again");
            }
            else if (y>x && y<=10){
                System.out.println("computer guesses  "+x+"\nuser guesses  "+y+"\nToo high, try again");
            }
            else{
                System.out.println("invalid input");
                break;
            }
        }while(i!=y);
	}
}