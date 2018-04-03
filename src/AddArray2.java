import java.util.Scanner;
public class AddArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three numbers for the first array");
		
		int [] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		System.out.println("Enter three numbers for the second array");
		
		int [] numbers2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		int [] add = new int [3];
		System.out.println("The sum of the two arrays is:");
		for (int i = 0; i<=numbers.length-1; i++){
			add[i] = numbers[i] + numbers2[i];
			System.out.println(add[i]);
		}	
		
		
		
		
		
		
		
		
		
		
	}

}
