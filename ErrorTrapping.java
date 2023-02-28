import java.util.InputMismatchException;
import java.util.Scanner;

class ErrorTrapping {
	static Scanner userinput = new Scanner(System.in);

	static int intTry(String message) {
		int response;
		String dummy;
		while (1 == 1) {
			try {
				System.out.print(message);
				response = userinput.nextInt();
				return response;
			} catch (InputMismatchException e) {
				dummy = userinput.nextLine();
				continue;
			}
		}
	}

	public static void main(String args[]) {
		int n;
		n = intTry("Enter a Number: ");
		System.out.println("You have entered: " + n);
	}
}
