import java.util.Scanner;

public class FirstSum {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter The Size :");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			int sum=0;
			System.out.println("Enter The Number1 :");
			int numberOne = scanner.nextInt();
			System.out.println("Enter The Number2 :");
			int numberTwo = scanner.nextInt();

			sum=numberOne+numberTwo;
			System.out.println(sum);
		}
	}
}
