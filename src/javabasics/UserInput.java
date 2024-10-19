package javabasics;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in); // Create an object for Scanner class

		System.out.println("Enter ambulance helpline: ");
		byte ambulance_helpline = scan.nextByte();

		System.out.println("Are you indian citizen: ");
		boolean isIndianCitizen = scan.nextBoolean();

		System.out.println("Enter course fee: ");
		short $course_fees = scan.nextShort();
		
		scan.nextLine(); // To escape Enter key before scanning a line

		System.out.println("Enter your initial: ");
		char _initial = scan.nextLine().charAt(0);

		System.out.println("Enter bike cost: ");
		int bike_cost = scan.nextInt();

		System.out.println("Enter interest rate: ");
		float interest_rate = scan.nextFloat();

		System.out.println("Enter phone number: ");
		long phone_number = scan.nextLong();

		System.out.println("Enter discount price: ");
		double discount_price = scan.nextDouble();
		
		scan.nextLine(); // To escape Enter key before scanning a line

		System.out.println("Enter your name: ");
		String myName = scan.nextLine();

		scan.close(); // close scanner to avoid resource leak

		System.out.println("ambulance_helpline: " + ambulance_helpline);
		System.out.println("isIndianCitizen: " + isIndianCitizen);
		System.out.println("$course_fees: " + $course_fees);
		System.out.println("_initial: " + _initial);
		System.out.println("bike_cost: " + bike_cost);
		System.out.println("interest_rate: " + interest_rate);
		System.out.println("phone_number: " + phone_number);
		System.out.println("discount_price: " + discount_price);
		System.out.println("Your name is: " + myName);

	}
}