package by.epam.jb.task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;

		System.out.println("Введите занчение a: ");

		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.println("Введите занчение b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.println("Введите занчение c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}

		if (a < 0) {
			a = (double)(Math.pow(a, 4));
			System.out.println("a = " + a);
		} else {
			a = a * a;
			System.out.println("a = " + a);
		}
		
		
		
		if (b < 0) {
			b = (double)(Math.pow(b, 4));
			System.out.println("b = " + b);
		} else {
			b = b * b;
			System.out.println("b = " + b);
		}
		
		
		
		if (c < 0) {
			c = (double)(Math.pow(c, 4));
			System.out.println("c = " + c);
		} else {
			c = c * c;
			System.out.println("c = " + c);

		}
	}

}
