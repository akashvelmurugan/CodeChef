import java.util.Scanner;

public class TheProductMystry {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int size =scanner.nextInt();
		for (int i = 0; i <size; i++) {
			int numberB = scanner.nextInt();
			int numberC = scanner.nextInt();

			int number=1;
			int count=1;
			int a=1;
			while (number>0) {
				a=numberB*count;
				if (a%numberC==0) {
					System.out.println(count);
					number=0;
				}
				count++;
			}
		}
	}
}
