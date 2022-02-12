import java.util.Scanner;

public class FruitChat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Count :");
		int T = scanner.nextInt();


		for (int i = 0; i < T; i++) {
			System.out.println("Enter X Value :");
			int X = scanner.nextInt();
			System.out.println("Enter Y value :");
			int Y = scanner.nextInt();

			if (X>Y||Y>0&&X/2<=Y) {
				X=X/2;
				System.out.println(X);
			}
		}
	}
}
