package by.epa.jb.task10;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		double x = 0;
		double fx = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		if (x <= -3) {
			fx = 9;
			
			System.out.println("fx = " + fx);
		}
		else if (x>3) {
			fx = 1/(x*x+1);
			System.out.println("fx = " + fx);
		}
	}

}
