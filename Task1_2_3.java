package by.epam.jb.task3;

import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class Task3 {

	public static void main(String[] args) {
		int n = 0;
		int ch = 0;
		int m = 0;

		System.out.print("Введите количество вещественных чисел: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}

		double[] array = new double[n];
		Random rand = new Random();

		System.out.println(" ");
		System.out.println("Массив вещественных чисел:");

		for (int i = 0; i < n; i++) {
			array[i] = rand.nextDouble();
			array[i] *= 100;
			System.out.println("[" + i + "]: " + array[i] + "   ");
		}
		System.out.println(" ");
		System.out.println("Те же числа, усеченные до int:");

		for (int i = 0; i < n; i++) {
			array[i] = (int) array[i];
			System.out.println("[" + i + "]: " + array[i] + "   ");
		}

		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0 && array[i] > 15) {
				ch++;
			}
		}
		System.out.println(" ");
		System.out.print("Количество четных чисел >15: " + ch);
	}
}
