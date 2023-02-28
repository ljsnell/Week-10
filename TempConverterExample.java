import java.util.Scanner;

public class TempConverterExample {
	static Scanner userinput = new Scanner(System.in);

	static double convertToCelcius(String from, double temp) {
		double answer = temp;
		if (from.charAt(0) == 'f') {
			answer = (5.0 / 9) * (answer - 32);
		}
		if (from.charAt(0) == 'r') {
			answer = (5.0 / 9) * (answer - 492);
		}
		if (from.charAt(0) == 'k') {
			answer = answer - 273;
		}
		return answer;
	}

	static double convertFromCelcius(String to, double temp) {
		double answer = temp;
		if (to.charAt(0) == 'f') {
			answer = (9.0 / 5) * answer + 32;
		}
		if (to.charAt(0) == 'r') {
			answer = (9.0 / 5) * answer + 492;
		}
		if (to.charAt(0) == 'k') {
			answer = answer + 273;
		}
		return answer;
	}

	public static void main(String[] args) {
		double temp;
		double newTemp;
		String fromM, toM;
		String choice = "y";
		System.out.println("Welcome to Temp Converter");
		System.out.println("You can choose from celcius (c), fahrenheit (f), rankine(r), or kelvin (k)");
		while (!(choice.charAt(0) == 'n')) {
			System.out.print("\nWhat is the temp?");
			temp = userinput.nextDouble();
			userinput.nextLine();
			System.out.print("From what?");
			fromM = userinput.nextLine();
			System.out.print("To what?");
			toM = userinput.nextLine();
			System.out.print("\n" + temp + " degrees " + fromM + " is ");
			newTemp = convertFromCelcius(toM, convertToCelcius(fromM, temp));
			System.out.format("%.1f", newTemp);
			System.out.print(" degrees " + toM);
			System.out.print("\nAnother Temp Conversion (y or n)?");
			choice = userinput.next();
		}
		System.out.println("Thanks for using Temp Converter.");
	}
}
