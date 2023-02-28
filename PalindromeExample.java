import java.util.Scanner;

public class PalindromeExample {
	static Scanner userinput = new Scanner(System.in);

	static boolean isPalindrome(int x) {
		String num;
		num = Integer.toString(x);
		int size = num.length();
		int j;
		boolean answer = true;
		char leftchar, rightchar;
		for (j = 0; j < (size / 2); j++) {
			leftchar = num.charAt(j);
			rightchar = num.charAt(size - j - 1);
			if (leftchar != rightchar) {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.print("Enter an Integer: ");
		int myx = userinput.nextInt();
		userinput.nextLine();
		if (isPalindrome(myx) == true) {
			System.out.println("It is a Palindrome.");
		} else {
			System.out.println("It is NOT a Palindrome.");
		}
	}
}
