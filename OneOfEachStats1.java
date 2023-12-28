/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		// defining the verubals
	int random = (int)(Math.random() * 11);
	int counter = 0;
	int children2 = 0;
	int children3 = 0;
	int childrenmax = 0;
	boolean b = false;
	boolean g = false;
	double avrage = 0;
	 int T = Integer.parseInt(args[0]);
	 
	 
	 // main loop runs the amount of times the user sets
	 for(int i = 0;i < T; i++){
		 //while loop runs the test to see how many children are in the family to have a boy and a gril
		while(!b || !g){
		if(random <= 5){
			b = true;
		}
		else{
			g = true;
		}
		counter ++;
		random = (int)(Math.random() * 11);
	 }
	 
	 //puts the amount of kids in a family in their catagory
	 if(counter == 2) children2 ++;
	 if(counter == 3) children3 ++;
	 if(counter >= 4) childrenmax ++;
	 
	 // resets the varubals so that the test can run again 
	 random = (int)(Math.random() * 11);
	 b = false;
     g = false;
	 avrage = avrage + counter;
     counter = 0;
	 
		 
	} 
	// printing the results of how many families are in each category
	avrage = avrage/T;
	System.out.println("Avrege: " + avrage + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + children2);
	System.out.println("Number of families with 3 children: " + children3);
	System.out.println("Number of families with 4 or more children: " + childrenmax);
	
	// determens and prints the most fruquent catagory of family
	if((children2 > children3) && (children2 > childrenmax)){
		System.out.println("The most common number of children is 2.");
	}
		else{
			if(children3 > childrenmax){
					System.out.println("The most common number of children is 3.");
			}
			else{
					System.out.println("The most common number of children is 4 or more children.");
			}
		}
}
}


