import java.util.Scanner;

public class WindChill {
	double t= 0;
	double v= 0;
	Scanner sc = new Scanner(System.in);
	public void input(){
		System.out.println("Enter the Temperature in Farenheit");
		t = sc.nextDouble();
		System.out.println("Temperature :"+t+"F");
		System.out.println();
		System.out.println("Enter the Wind speed ");
		v = sc.nextDouble();
		System.out.println("Wind speed (in miles per hour)" + v);
	}	
	 public void calculation() {
		 input();
		 if(t > 50 || v > 120) {
		 double w = 35.74 + 0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		 System.out.println("National Weather Service defines the effective temperature (the wind chill) to be:" + w);
		 }else {
			 System.out.println("Pleas enter the value within range");
		 }
	 }

	public static void main(String[] args) {
		
		WindChill wind = new WindChill();
		wind.calculation();
	}

}
