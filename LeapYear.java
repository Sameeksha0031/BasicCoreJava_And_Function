import java.util.Scanner;
public class LeapYear {
	
	Scanner sc = new Scanner(System.in);
	int flag = 0;
	
	public void checkYear() {
		 System.out.println("Enter the year to check");
		  int checkyear = sc.nextInt();
		  int  year = checkyear;
		  while(checkyear !=0 ) {
			  checkyear = checkyear /10;
			  flag++;
		  }
		  if(flag == 4) {
  
			  if((year % 4 == 0) || (year % 4 ==0 )) {
					System.out.println(year + " is a leap year ");
				}else {
					System.out.println(year + " is not a leap year");
				}
			  
		  }else {
			  System.out.println("Please Enter valid Year");
		  }
	} 

	public static void main(String[] args) {
		
		LeapYear obj = new LeapYear();
	    obj.checkYear();

	}

}
