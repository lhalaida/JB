package by.epam.jb.Task9;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		double R = 0, S = 0, P = 0;
		
		System.out.println("Введите длину радиуса: ");
		if (sc.hasNextDouble()){
			R = sc.nextDouble();
		}
				
		if (R > 0) {
			P = 2*pi*R;
			System.out.println("Периметр окружности P = " + P);
			S = pi*R*R;
			System.out.println("Периметр окружности S = " + S);
				
		}
		else {System.out.println("Радиус не может иметь отрицательное значение.");
						
		}
		

	}

}
