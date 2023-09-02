import java.util.Scanner;

public class Task2 {
	public static int formula(int n, int r) {
		if(n < 0 || r < 0) {
			System.out.println("No negative numbers.");
			return -1;
		}
		if(n < r) {
			System.out.println("n should not be less than r");
			return 0;
		}
		else if(r == 0) {
			System.out.println("Cannot divide by zero.");
			return 1;
		}
		else if(r==1) {
			return n;
		}
		else if(n==1) {
			System.out.println("Error");
			return 1;
		}
		else {
			return (formula(n,r-1)*(n-r+1)/r);
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the value for n:");
		int n = 0;
		int r = 0;
		try {
			n = keyboard.nextInt();
		}
		catch(Exception e) {
			System.out.println("Numbers are the only valid inputs.");
			System.exit(0);
		}
		
		System.out.println("Enter the value for r:");
		try {
			r = keyboard.nextInt();
		}
		catch(Exception e) {
			System.out.println("Numbers are the only valid inputs.");
			System.exit(0);
		}
		
		System.out.println(formula(n,r));
	}
}
