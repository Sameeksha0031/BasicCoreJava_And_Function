import java.util.Scanner;
public class HeadsAndTails {
	
	int head = 0;
    int tails = 0;
	float percentage = 0;
	int NumberOf_Flip = 0;
	float a=0,b=0;
	
    public void input() {
    	Scanner sc = new Scanner(System.in);
    	NumberOf_Flip = sc.nextInt();
    }
    
    public void count() {
        if(NumberOf_Flip > 0) {
    	  for(int i=1;i<=NumberOf_Flip;i++) {
    		int random = (int)(Math.random()*10)%2 ;
    		if(random == 0 ) {
    			System.out.println("Heads");
    			head=head+1;
    		}
    		if(random == 1){
    			
    			System.out.println("Tails");
    			tails=tails+1;
    		}
    	  }
         System.out.println(head+" "+tails);
    	}
     }
     
    public void percentage() {
           a=(head*100/NumberOf_Flip);
           b=(tails*100/NumberOf_Flip);
           percentage = ((head + tails)*100/NumberOf_Flip) ;
           System.out.println(percentage+" "+a+" "+b);
     }
    
	public static void main(String[] args) {
	   
		HeadsAndTails flip = new HeadsAndTails();
		flip.input();
		flip.count();
		flip.percentage();
	}

}
