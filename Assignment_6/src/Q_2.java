
public class Q_2 {

	public static int getPentagonalNumber(int n) {
		int pgnumber = (3 * n - 1) / 2;
		return pgnumber;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.print(getPentagonalNumber(i) + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
