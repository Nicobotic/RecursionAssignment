import java.util.Scanner;

public class Task1 {
	public static int handshake(int n) {
		if(n<0) {
			System.out.println("There cannot be negative people in a room.");
			return -1;
		}
		else if(n == 0) {
			return n;
		}
		else {
			return (handshake(n-1)+(n-1));
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many people are in the room?");
		int people = 0;
		try {
			people = keyboard.nextInt();
		}
		catch(Exception e) {
			System.out.println("Only valid input is numbers.");
			System.exit(0);
		}
		System.out.println("If everyone shakes hands once, there will be " + handshake(people) + " handshakes.");
	}
}
