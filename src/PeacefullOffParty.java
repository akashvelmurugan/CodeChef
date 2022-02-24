import java.util.Scanner;

public class PeacefullOffParty {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);

		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			int array[]=new int[size];
			for (int j = 0; j <size; j++) {
				array[j]= scanner.nextInt();
			}
			if (array[0]+array[2]>array[1]) {
				System.out.println(array[0]+array[2]);
			} else {
				System.out.println(array[1]);
			}
		}
	}
}

