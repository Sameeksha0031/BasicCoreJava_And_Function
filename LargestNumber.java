import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LargestNumber obj = new LargestNumber();
		System.out.println("Enter a number");
		double X = sc.nextDouble();
		System.out.println("Enter a number");
		double Y = sc.nextDouble();
		System.out.println("Enter a number");
		double Z = sc.nextDouble();
		obj.maxinum(X,Y,Z);

	}

	public void maxinum(double x, double y, double z) {
		if(x > y && x > z) {
		   System.out.println(x + " is a Largest Number");	
		}else if(y > x && y > z) {
		   System.out.println(y + " is a Largest Number");	
		}else {
		   System.out.println(z + " is a Largest Number");	
		}
	}

}
