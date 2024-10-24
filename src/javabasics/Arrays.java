package javabasics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* One dimension array */

		// Array initialization with default size and values
		int marks[] = { 93, 70, 78, 89, 88 };
		System.out.println(marks[0]);

		// Array declaration with fixed size
		char vowels[] = new char[5];
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		System.out.println(vowels[2]);

		/*
		 * int numArr[] = new int[5]; long longArr[] = new long[10]; float floatArr[] =
		 * new float[3]; double doubArr[] = new double[2]; String strArr[] = new
		 * String[7];
		 */

		/* Two dimension Array (Matrix) */
		double coordinates[][] = { { 0.1, 0.2, 0.3 }, { 1.1, 1.2, 1.3 }, { 2.1, 2.2, 2.3 }, }; // 3X3
		System.out.println("coordinates[1][2]: " + coordinates[1][1]);

		// static length
		boolean table[][] = new boolean[2][2];
		table[0][0] = true;
		table[0][1] = false;
		table[1][0] = true;
		table[1][1] = false;
		System.out.println("table[1][0]: " + table[1][0]);

		// dynamic row length
		int arr[][] = new int[3][]; // we can assign dynamic length for each row
		arr[0] = new int[5];
		arr[1] = new int[29];
		arr[2] = new int[100];
		System.out.println("arr[1][0]: " + arr[0][4]);
		System.out.println("============");

		/* Accessing array elements using for loop */
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("mark " + (i + 1) + " = " + marks[i]);
			total += marks[i];
		}
		System.out.println("Total = " + total);
		// using for each loop
		for (int mark : marks) { // for each mark in marks array
			System.out.print(mark + " ");
		}

		/* Get inputs from user and store into an array */
		String foods[] = new String[3];
		int foods_length = foods.length;

		System.out.println("\nEnter your top 3 favorite foods: ");
		for (int i = 0; i < foods_length; i++) {
			foods[i] = scan.next(); // storing into the foods array
		}
		// print the output
		for (String food : foods) {
			System.out.print(food + " ");
		}
		
		scan.close();

	}

}
