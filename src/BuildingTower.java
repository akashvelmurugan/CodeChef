import java.util.Scanner;

public class BuildingTower {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("How Many Test Case :");
		int size = scanner.nextInt();


		for (int i = 0; i < size; i++) {
			System.out.println("Enter Count :");
			int count = scanner.nextInt();
			int array[]=new int[count+1];
			int sum =0;

			for (int j = 0; j <count+1; j++) {
				System.out.println("Enter The Value :");
				int number = scanner.nextInt();

				sum=sum+number;
				array[j]=sum;
				System.out.println(j+" "+array[j]);
			}
			int temp;
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k <array.length; k++) {
					if (array[j]>array[k]) {
						temp=array[j];
						array[j]=array[k];
						array[k]=temp;
					}
				}
			}
			System.out.println("Answer :"+array[0]);
		}
	}
}
//sample test case
//3 
//5 
//8 0 3 3 -13 5