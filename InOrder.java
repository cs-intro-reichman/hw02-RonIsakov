/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// defining 2 ints and setting num2 as a random num
		//between 0 inc and 10
	int num1 = 0;
	int num2 = (int)(Math.random() * 10);
	
	// defining a loop while the number that was generated is bigger or even 
	// to the number befor it prints it 
	while (num1 <= num2){
		System.out.println(num2);
		num1 = num2;
		num2 = (int)(Math.random() * 10);
	}
	}
}
