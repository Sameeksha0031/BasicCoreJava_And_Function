import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char X = sc.next().charAt(0);
		int i= 0;
		int flag = 0;
		char volwel[] = {'a','e','i','o','u','A','E','I','O','U'};
	
		while ( i < volwel.length) {
			if(volwel[i] == X ){
				flag++;	
			}
			i++;
		}
		if(flag != 0 ) {
			System.out.println("Alphabet is volwel ");
		}else {
			System.out.println("Alphabet is consonant ");
		}
	}
}
