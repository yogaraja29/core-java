package javabasics;

import java.util.Scanner;

public class JumpStatements {

	public static void main(String[] args) {

		/* Loop control statements: break & continue */

		// break
		Scanner scan = new Scanner(System.in);
		double num, sum = 0.0;
		System.out.println("Enter the numbers to add or enter a negative number to exit");
		while (true) {
			num = scan.nextDouble();
			if (num < 0.0) {
				break;
			}
			sum += num;
		}
		System.out.println("Sum = " + sum);
		System.out.println("============");

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5; k++) {
				if (i == 3 && k == 3) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("============");

		// labelled break
		outer_loop: for (int i = 1; i <= 5; i++) {
			// inner_loop:
			for (int k = 1; k <= 5; k++) {
				if (i == 3 && k == 3) {
					break outer_loop; // labelled break
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n============");

		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) {
				continue;
			}
			System.out.println("i= " + i);
		}
		System.out.println("============");

	}

}
