import java.util.Scanner;

public class swapnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for X");
		int X = sc.nextInt();
		System.out.println("Enter the number for Y");
		int Y = sc.nextInt();
		System.out.println("Before Swapping X = "+X+", Y = "+Y);
        int Z = X;
        X = Y;
        Y = Z;
        System.out.println("After Swapping X = "+X+", Y = "+Y);
	}

}
