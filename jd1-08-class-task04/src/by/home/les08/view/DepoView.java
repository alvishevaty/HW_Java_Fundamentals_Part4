package by.home.les08.view;

import by.home.les08.entity.Train;

public class DepoView {

	public void printTrains(Train[] trains) {

		System.out.println("Поезда по номеру: ");

		for (int i = 0; i < trains.length; i++) {

			System.out.print(trains[i].getTrainNumber());
			System.out.print("\t" + trains[i].getDeparture() + " - ");
			System.out.print(trains[i].getDestination());
			System.out.print("\t" + trains[i].getDepartureHour() + ":");
			System.out.print(trains[i].getDepartureMinute() + ";");
			System.out.println();
		}

	}

	public void printSortTrains(Train[] trains) {

		System.out.println("Поезда по месту назначения и времени отправления: ");

		for (int i = 0; i < trains.length; i++) {

			System.out.print(trains[i].getTrainNumber());
			System.out.print("\t" + trains[i].getDeparture() + " - ");
			System.out.print(trains[i].getDestination());
			System.out.print("\t" + trains[i].getDepartureHour() + ":");
			System.out.print(trains[i].getDepartureMinute() + ";");
			System.out.println();
		}

	}
}
