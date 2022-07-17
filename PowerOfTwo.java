import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++) {
			
			int num = (int) Math.pow(2, i);
			System.out.println(num);
		}

	}

}
