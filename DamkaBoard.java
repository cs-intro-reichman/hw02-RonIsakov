/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//user inserting int num as dimensions of the board
		 int num = Integer.parseInt(args[0]);

        // Printing the Damka board with num*num dimensions
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
