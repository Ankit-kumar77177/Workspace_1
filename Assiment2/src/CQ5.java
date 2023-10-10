
public class CQ5 {

	public static void main(String[] args) {
		 int a = Integer.parseInt( args[0] );
         int b = Integer.parseInt( args[1] );
         int c = Integer.parseInt( args[2] );
         int x = Math.min(a, b);
         int min = Math.min(x,c);
         int z = Math.max(a, b);
         int max = Math.max(z, c);
         int mid = a+ b+ c- min - max;
         System.out.println("min = "+min);
         System.out.println("mid = "+mid);
         System.out.println("max = "+max);
     }
 }
	


