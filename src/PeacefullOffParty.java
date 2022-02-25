import java.util.Scanner;

public class PeacefullOffParty {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);

		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int city[]=new int[3];
			for (int j = 0; j <3; j++) {
				city[j]= scanner.nextInt();
			}
			int a=city[0];
			int b=city[1];
			int c=city[2];
			if (a+c>b) {
				System.out.println(a+c);
			} else {
				System.out.println(b);
			}
		}
	}
}

