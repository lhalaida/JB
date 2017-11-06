package by.epam.jb.task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c;
		Scanner cs = new Scanner(System.in);

		System.out.println("Enter number a");
		if (cs.hasNextDouble()) {
			a = cs.nextInt();
		}

		System.out.println("Enter number b");
		if (cs.hasNextDouble()) {
			b = cs.nextInt();
		}

		if (a == b) {
			System.out.println("New Year is coming soon!");
		} else {

			c = a + b;
			System.out.println("a + b + c = " + (a + b + c));
			System.out.println("a^2 + b^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)));
			System.out.println("I dont like watching football.");
		}
	}
}
