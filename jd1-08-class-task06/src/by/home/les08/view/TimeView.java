package by.home.les08.view;

import java.util.Scanner;

public class TimeView {
	
	public int[] setUserTime() {

		int[] arrayHourMinSec = new int[3];
		String[] denomination = new String[] { "часа, ч", "минут, мин", "секунд, с" };

		for (int i = 0; i < arrayHourMinSec.length; i++) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Введте значение для " + denomination[i] + ": ");

			while (sc.hasNextInt() == false) {
				String s = sc.next();
				System.out.print("Повторите ввод: ");
			}
			arrayHourMinSec[i] = sc.nextInt();
		}
		return arrayHourMinSec;
	}

	public void printTime(int[] arrayHourMinSec) {

		String[] denomination = new String[] { "ч", "мин", "с" };
		int j = 0;

		for (int i = arrayHourMinSec.length - 1; i > 0; i--) {
			System.out.print(arrayHourMinSec[i] + denomination[j] + " ");
			j++;
		}
		System.out.print(arrayHourMinSec[0] + denomination[j]);
	}

	public void printTime(int hour, int minute, int second) {

		System.out.print(hour + "ч ");
		System.out.print(minute + "мин ");
		System.out.println(second + "с");
	}
}
