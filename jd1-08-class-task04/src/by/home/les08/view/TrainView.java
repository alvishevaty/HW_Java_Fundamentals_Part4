package by.home.les08.view;

import by.home.les08.entity.Train;

public class TrainView {

	public void printTrainInfo(Train train) {

		System.out.println("♦ Информация о поезде номер " + train.getTrainNumber() + ": ");

		System.out.print("\tНаправление: " + train.getDeparture());
		System.out.println(" - " + train.getDestination() + ";");
		System.out.print("\tВремя отправления: " + train.getDepartureHour());
		System.out.print(":" + train.getDepartureMinute() + ";");

		System.out.println();
	}
}
