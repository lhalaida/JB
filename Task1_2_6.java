package by.epam.jb.task6;

import java.util.Scanner;

public class Task6 {

	private static Scanner sc;

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c= 0;
		double d = 0;
		double rez1 = 0;
		double rez2= 0;

		System.out.print("Введите a: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();

		}
		System.out.print("Введите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		System.out.print("Введите d: ");
		if (sc.hasNextDouble()) {
			d = sc.nextDouble();
		}

		rez1 = b + (double)(Math.sqrt(b*b + 4*a*c));
		rez1 = rez1/(2*a);
		rez1 = rez1 - (double)(Math.pow(a, 3)*c + b);
		
		System.out.println("Rez1 = " + rez1);
		
		rez2 = (a*b)/(c*d) - (a*b - c)/(c*d);
		
		System.out.println("Rez2 = " + rez2);
		
		
		
	}

}
