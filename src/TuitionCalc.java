import java.util.Scanner;


public class TuitionCalc {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input tutition rate.");
		double tuition = keyboard.nextDouble();
		while (tuition < 0) {
			System.out.println("Please enter a positive number.");
			tuition = keyboard.nextDouble();
		}

		System.out.println("Input percent increase per year (Ex. If 5% input '5').");
		double percentage = (keyboard.nextDouble() / 100);
		while (percentage < 0) {
			System.out.println("Please eneter a positive number.");
			percentage = (keyboard.nextDouble() / 100);
		}

		// Calculator
		double a = (tuition * percentage) + tuition;
		double b = (a * percentage) + a;
		double c = (b * percentage) + b;
		double answer = (tuition + a + b + c);
		System.out.printf("The total tuition cost for 4 years of college: $%.2f", answer);
	}
}
