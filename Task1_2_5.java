package by.epam.jb.task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Введите число: ");
			if (sc.hasNextInt()) {
				array[i] = sc.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Сумма чисел: " + sum);

	}
}
