import java.util.Scanner;
public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any three no. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1<n2 && n2<n3)
		System.out.println("Assinding");
		else if (n1>n2 && n2>n3)
			System.out.println("Desinding ");
		else
			System.out.println("Nither Assinding Nor Desinding ");

	}

}
