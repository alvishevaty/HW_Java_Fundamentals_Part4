package by.home.les08.main;

import by.home.les08.entity.Depo;
import by.home.les08.entity.Train;
import by.home.les08.logic.DepoLogic;
import by.home.les08.view.DepoView;
import by.home.les08.view.TrainView;

public class Main {

	/*
	 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер
	 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
	 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
	 * Добавьте возможность вывода информации о поезде, номер которого введен
	 * пользователем. Добавьте возможность сортировки массив по пункту назначения,
	 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
	 * времени отправления.
	 */
	
	public static void main(String[] args) {

		Depo depo = new Depo();
		DepoLogic depoLogic = new DepoLogic();
		DepoView depoView = new DepoView();
		TrainView trainView = new TrainView();

		depo.setTrains(new Train(921, "Зеленый луг", "Восток", 23, 45));
		depo.setTrains(new Train(1, "ДС Веснянка", "Вокзал", 16, 18));
		depo.setTrains(new Train(100, "ДС Славинского", "Восток", 22, 30));
		depo.setTrains(new Train(37, "ДС Карбышева", "ДС Восточная", 18, 15));
		depo.setTrains(new Train(119, "Аквапарк", "Вокзал", 9, 38));

		depoView.printTrains(depoLogic.sort(depo.getTrains()));

		System.out.println("__________________________________");

		trainView.printTrainInfo(depoLogic.trainInfo(trainView.writeNumber(), depo.getTrains()));

		System.out.println("__________________________________");

		depoView.printSortTrains(depoLogic.sortDepTime(depoLogic.sortDestination(depo.getTrains())));
	}

}
