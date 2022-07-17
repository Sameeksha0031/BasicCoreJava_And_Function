//import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray {
	
	Scanner sc = new Scanner(System.in);
	
	//Integer Matrix
	public void inputInteger() {
		int Array[][] = new int[10][10];
		System.out.println("Enter the number of row and colums array");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the elements in array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				Array[i][j]=sc.nextInt();
			}
		}
		printInteger(Array,m,n);
	 }

	public void printInteger(int[][] a,int x,int y) {
		System.out.println("Elements in array");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				
				System.out.println(a[i][j]);
			}
		}
   	}
	
	//Double Matrix
     public void inputDouble() {
		
		Double Array[][] = new Double[10][10];
		System.out.println("Enter the number of row and colums array");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the elements in array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				Array[i][j]=sc.nextDouble();
			}
		}
		printDouble(Array,m,n);
	 }

	public void printDouble(Double[][] a,int x,int y) {
		System.out.println("Elements in array");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				
				System.out.println(a[i][j]);
			}
		}
	}
	
	  public void inputBoolean() {
			
			Boolean Array[][] = new Boolean[10][10];
			System.out.println("Enter the number of row and colums array");
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println("Enter the elements in array");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					
					Array[i][j]=sc.nextBoolean();
				}
			}
			printBoolean(Array,m,n);
		 }

		public void printBoolean(Boolean[][] a,int x,int y) {
			System.out.println("Elements in array");
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					//System.out.println(a[i][j]);
					 if (a[i][j]) { 
						 System.out.print("1 ");
					  }
		                else {
		                 System.out.println("0 ");   	
		              }
				}
			}
		}
	

	public static void main(String[] args) {
		
		TwoDArray obj = new TwoDArray();
		System.out.println("Matrix Integer");
		obj.inputInteger();
		System.out.println();
		System.out.println("Matrix Double");
		obj.inputDouble();
		System.out.println();
		System.out.println("Matrix Boolean");
		obj.inputBoolean();
	  }
    }
