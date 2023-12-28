
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
	// defining int random witch generates a number between 10 and 0 include
	int random = (int)(Math.random() * 11);
	
	//defining varubals
	int counter = 0;
	boolean b = false;
	boolean g = false;
	
	//loop that tests how many children there are until there is a boy and a gril
	while(!b || !g){
		if(random <= 5){
			b = true;
			if(counter == 0)
			System.out.print("b");
		else 
			System.out.print(" b");
		}
		else{
			g = true;
			if(counter == 0)
			System.out.print("g");
		else 
			System.out.print(" g");
		}
		random = (int)(Math.random() * 11);
		counter ++;
	}
	
	//printing the amount of children
	System.out.println();
	System.out.println("You made it... and you now have " + counter + " children.");

			
	}
}
