import java.util.Scanner;
public class Quadratic {
	
	Scanner sc = new Scanner(System.in);
	public void input(){
		System.out.println("Enter the value for a");
		double a = sc.nextInt();
		System.out.println("Enter the value for b");
		double b = sc.nextInt();
		System.out.println("Enter the value for c");
		double c = sc.nextInt();
		System.out.  println("find the roots of the equation "+a+"*x*x + "+b+"x + "+c);
		computedelta(a,b,c);
		}
    
	public void computedelta(double a, double b, double c) {
	   double delta = b * b - 4 * a *c;
	   System.out.println(delta);
	   
	   if(delta > 0 ) {
	          double x1 = (-b + Math.sqrt(delta))/(2*a);
	          double x2 = (-b - Math.sqrt(delta))/(2*a);
	          System.out.println("Root 1 of x :"+x1);
	          System.out.println("Root 2 of x :"+x2);
	   }else if(delta == 0) {
		      double x1 = -b / (2.0 * a);
              System.out.println("The root is " + x1);   
	   }else {
		      System.out.println("Roots are not real.");
	   }
	}

	public static void main(String[] args) {
		 Quadratic obj = new  Quadratic();
		 obj.input();
	}

}
