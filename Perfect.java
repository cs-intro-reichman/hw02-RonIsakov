
public class Perfect {
	public static void main (String[] args) {
		// requsting an int and defining it as num
	int num = Integer.parseInt(args[0]);
	
	//defining a string and an int
	String print = num + " is a perfect number since " + num + " =";
	int sum = 0;
	
	// locking for all the devisors of a number and storing the sum of them
	// in sum a list of them in print
	for(int i = 1; i<num ; i++){
	if(num%i == 0){
	print = print + (  " + " + i );
	sum = sum +i;
	}
}

// cheking if the number is perfect if it is printing String num
//else printing the number an saying its not perfect
if (sum  == num){
System.out.println(print);
}
else{
	System.out.println(num + " is not a perfect number");
}
	}
	
}
