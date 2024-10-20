package javabasics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your mark (0-100): ");
		int mark = scan.nextInt();

		/* If else condition */
		if (mark >= 90) {
			System.out.println("Grade A");
		} else if (mark >= 80) {
			System.out.println("Grade B");
		} else if (mark >= 70) {
			System.out.println("Grade C");
		} else if (mark >= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade E");
		}

		/* Ternary operator */
		String result = mark >= 35 ? "You passed the exam" : "You failed the exam";
		System.out.println("Result: " + result);
		System.out.println("============");

		boolean hasDriversLicense = false;
		boolean hasGoodVision = true;
		boolean isTired = false;
		if (hasDriversLicense || (hasGoodVision && !isTired)) {
			System.out.println("Can Driving...");
		} else {
			System.out.println("Can't Driving...");
		}
		System.out.println("============");

		/* Switch case statement */
		System.out.println("Enter first number: ");
		int x = scan.nextInt();
		System.out.println("Enter second number: ");
		int y = scan.nextInt();
		System.out.println("Enter the operation(+,-,*,/,%): ");
		char operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(x + " " + operator + " " + y + " = " + (x + y));
			break;
		case '-':
			System.out.println(x + " " + operator + " " + y + " = " + (x - y));
			break;
		case '*':
			System.out.println(x + " " + operator + " " + y + " = " + (x * y));
			break;
		case '/':
			System.out.println(x + " " + operator + " " + y + " = " + (x / y));
			break;
		case '%':
			System.out.println(x + " " + operator + " " + y + " = " + (x % y));
			break;
		default:
			System.out.println("You've entered wrong operator");
		}
		System.out.println("============");

		System.out.println("Enter the alphabet(a to z): ");
		char alphabet = scan.next().charAt(0);
		switch (alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(alphabet + " is vowel");
			break;
		default:
			System.out.println(alphabet + " is consonent");
		}
		System.out.println("============");

		scan.close();
	}
}
