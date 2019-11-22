package by.home.les08.logic;

import java.util.Scanner;

import by.home.les08.entity.Time;

public class TimeLogic {

	public int[] setUserTime() {

		int[] mas = new int[3];
		String[] mas1 = new String[] { "часа, ч", "минут, мин", "секунд, с" };

		for (int i = 0; i < mas.length; i++) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Введте значение для " + mas1[i] + ": ");

			while (sc.hasNextInt() == false) {
				String s = sc.next();
				System.out.print("Повторите ввод: ");
			}

			mas[i] = sc.nextInt();

		}
		return mas;
	}

	public int[] changeTime(int[] mas, Time time) {

		int[] exchange = new int[3];

		int setFirstHour = time.getHour();
		int setFirstMinute = time.getMinute();
		int setFirstSecond = time.getSecond();

		exchange[0] = (setFirstSecond + mas[2]) % 60;
		int residue1 = (setFirstSecond + mas[2]) / 60;
		exchange[1] = (setFirstMinute + mas[1] + residue1) % 60;
		int residue2 = (setFirstMinute + mas[1] + residue1) / 60;
		exchange[2] = (setFirstHour + mas[0] + residue2) % 24;

		return exchange;
	}

}
