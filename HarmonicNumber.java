import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int N = sc.nextInt();
		double sum = 0;
		System.out.println();
		System.out.println("Harmonic Series");
		if( N != 0) {
		for(int i=1;i<=N;i++) {
			
			sum = sum + (double)1/i;
			if(i == N) {
				System.out.println("1/"+ i);
			}else {
			System.out.println("1/"+ i + "+");
	    	}
		}
		System.out.println("Harmonic value: "+sum );
	  }
	}

}
