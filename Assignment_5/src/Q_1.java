import java.util.Scanner;
public class Q_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if (sum_num1 == sum_num2)
            System.out.println(+num1+" and "+num2+" are amicable number.");
        else
            System.out.println(+num1+" and "+num2+" are not amicable number.");
			System.out.println("\n");	

}

}       
		            
