package by.epam.jb.task2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int n = 0;
		int chCount = 0;
		int div3Summ = 0;
		int smallerThan3 = 0;
		System.out.print("Введите количество чисел: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите число: ");
			if (sc.hasNextInt()) {
				array[i] = sc.nextInt();
				
				if (array[i] % 2 == 0) {
					chCount++;
				}
				if (array[i] % 3 == 0) {
					div3Summ = array[i] + div3Summ;

				}
				if (Math.abs(array[i]) < 3) {
					smallerThan3++;
				}
			}
		}
		System.out.println("Количество четных чисел: " + chCount);
		System.out.println("Сумма чисел, кратных 3-м = " + div3Summ);
		System.out.println("Количество чисел меньше 3 по модулю: " + smallerThan3);

	}

}