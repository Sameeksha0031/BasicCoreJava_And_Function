import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int X = sc.nextInt();
		if( X%2 == 0) {
			
			System.out.println(X + " is an Even Number");
		
		}else {
		
			System.out.println(X + " is an Odd Number");
		}

	}

}
