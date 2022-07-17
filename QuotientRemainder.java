import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		double quotient = (double)number1/ number2;
		System.out.println("Quotient :" + quotient );
		int remainder= number1 % number2;
		System.out.println("Remainder :" + remainder );

	}

}
