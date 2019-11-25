package by.home.les08.view;

import java.util.List;
import java.util.Scanner;

import by.home.les08.entity.Airline;

public class AirlineView {

	public String writeDestination() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите пункт назначения: ");
		String name = sc.next();
		return name;
	}

	public String writeDayWeek() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите день недели: ");
		String name = sc.next();
		return name;
	}

	private static final int ARRAY_SIZE = 2;

	public int[] writeTime() {

		int[] arrayHourMinutes = new int[ARRAY_SIZE];
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите час отправления: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите час отправления: ");
		}

		arrayHourMinutes[0] = sc.nextInt();

		System.out.print("Введите минуты отправления: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите минуты отправления: ");
		}

		arrayHourMinutes[1] = sc.nextInt();

		return arrayHourMinutes;
	}

	public void printAirline(String name, List<Airline> airlineArray) {

		System.out.println(name);

		int airlineCounter = 1;
		if (airlineArray.size() > 0) {
			for (int i = 0; i < airlineArray.size(); i++) {

				System.out.print("\t" + airlineCounter + ".");
				System.out.print(" \"" + airlineArray.get(i).getDestination() + "\"");
				System.out.print("\t" + airlineArray.get(i).getFlightNumber());
				System.out.print("\t" + airlineArray.get(i).getAirplaneType());
				System.out.print(
						"\t" + airlineArray.get(i).getDepartureHour() + ":" + airlineArray.get(i).getDepartureMinute());
				System.out.print("\t" + airlineArray.get(i).getWeekDay());
				System.out.println();
				airlineCounter++;
			}
		} else if (airlineArray.size() == 0) {
			System.out.println("\tРейсов с такими параметрами нет.");
		}

	}
}
