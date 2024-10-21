package javabasics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* for loop */
		System.out.println("Print first \"n\" odd numbers: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n============");

		/* while loop */
		System.out.println("\nSum and factorial of first \"n\" natural numbers: ");
		n = scan.nextInt();
		int j = 1, sum = 0, factorial = 1;
		while (j <= n) {
			sum += j;
			factorial *= j;
			j++;

		}
		System.out.println("Sum= " + sum);
		System.out.println(n + " " + "Factorial= " + factorial);
		System.out.println("============");

		/* do-while loop */
		int choice = 0;
		do {
			System.out.println("Enter your choice: \n 1.Play \n 2.Exit");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Playing...");
			}
		} while (choice == 1);
		System.out.println("Game over...");
		System.out.println("============");

		// nested loop: pattern printing
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		scan.close();

	}

}
