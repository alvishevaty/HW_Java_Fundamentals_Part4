package by.home.les08.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Airline;
import by.home.les08.logic.AirlineLogic;
import by.home.les08.view.AirlineView;

public class Main {

	/*
	 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт
	 * назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и
	 * вывести: a) список рейсов для заданного пункта назначения; b) список рейсов
	 * для заданного дня недели; c) список рейсов для заданного дня недели, время
	 * вылета для которых больше заданного.
	 */

	public static void main(String[] args) {

		AirlineView airlineView = new AirlineView();
		AirlineLogic airlineLogic = new AirlineLogic();

		Airline airline1 = new Airline("Будапешт", 3512, "Boeing-777", 9, 25, "Вторник");
		Airline airline2 = new Airline("Будапешт", 4986, "Boeing-767", 10, 10, "Вторник");
		Airline airline3 = new Airline("Париж", 9872, "Boeing-777", 10, 25, "Среда");
		Airline airline4 = new Airline("Батуми", 8946, "Boeing-767", 17, 30, "Суббота");
		Airline airline5 = new Airline("Париж", 3462, "Boeing-777", 7, 20, "Вторник");

		List<Airline> airlineList = new ArrayList<Airline>();
		airlineList.add(airline1);
		airlineList.add(airline2);
		airlineList.add(airline3);
		airlineList.add(airline4);
		airlineList.add(airline5);

		airlineView.printAirline("• Cписок рейсов для заданного пункта назначения:",
				airlineLogic.findDestinationFlight(airlineList, airlineView.writeDestination()));
		airlineView.printAirline("• Список рейсов для заданного дня недели:",
				airlineLogic.findEqualDayWeekFlight(airlineList, airlineView.writeDayWeek()));

		int[] departureTime = airlineView.writeTime();
		airlineView.printAirline("• Cписок рейсов для заданного дня недели, время вылета для которых больше заданного:",
				airlineLogic.findEqualDayWeekAndTimeFlight(airlineList, airlineView.writeDayWeek(), departureTime));
	}

}
