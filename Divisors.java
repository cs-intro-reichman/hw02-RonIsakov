/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
public static void main (String[] args) {
	// the user inserts the x
	int x = Integer.parseInt(args[0]);
	
// a loop that test witch of the numbers are a devisor of x
for(int i = 1; i<=x ; i++){
	if(x%i == 0){
	System.out.println(i);
	}
}


	}
}
