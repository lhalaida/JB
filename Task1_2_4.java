package by.epam.jb.task5;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Task5 {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		int summ = 0;

		out.print("Введите количество целых чисел >15: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}

		int[] array = new int[n];
		Random rand = new Random();

		out.println(" ");
		out.println("Массив целых чисел:");

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(n);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 15 || array[i] < 2) {
				m++;
			}
			if (array[i] % 5 == 4) {
				summ = summ + array[i];
			}
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Количество чисел >15 или <2 : " + m);
		System.out.println("Выводит сумму чисел которые делятся 5 с остатком 4: " + summ);

	}

}