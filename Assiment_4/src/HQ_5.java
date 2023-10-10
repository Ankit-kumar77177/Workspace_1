import java.util.*;
public class HQ_5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter a no. ");
	        int n= sc.nextInt();
	        String p="";
	        for(int i=1;i<=n;i++){
	            p+=(i+p);
	            System.out.println(p);
	        }
	        //System.out.println("end");
	}

}
