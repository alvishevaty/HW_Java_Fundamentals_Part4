package by.home.les08.view;

public class TimeView {

	public void printTime(int[] mas) {

		String[] mas1 = new String[] { "ч", "мин", "с" };
		int j = 0;

		for (int i = mas.length - 1; i > 0; i--) {
			System.out.print(mas[i] + mas1[j] + " ");
			j++;
		}
		System.out.print(mas[0] + mas1[j]);
	}

	public void printTime(int hour, int minute, int second) {

		System.out.print(hour + "ч ");
		System.out.print(minute + "мин ");
		System.out.println(second + "с");
	}
}
