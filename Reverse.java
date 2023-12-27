
public class Reverse {
	public static void main (String[] args){
		//inserting String
		String original = args[0];
		
		// defining 2 verubals String backwards and Char letter
		String backwards = "";
		char letter;
		char middle;
		
		// loop that creats original backwards as the String backwards
		for(int i = original.length() - 1; i >= 0; i--){
			letter = original.charAt(i);
			backwards = backwards + letter;
		}
		

		 if (original.length() % 2 == 0) {
            middle = original.charAt(original.length() / 2 - 1);
        } 
		else {
            middle = original.charAt(original.length() / 2);
        }

			
		//printing the middle letter plus String backwarsd
		System.out.println("The middle character is " + middle);
		System.out.println(backwards);

	}
}
