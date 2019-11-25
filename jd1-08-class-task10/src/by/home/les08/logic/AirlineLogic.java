package by.home.les08.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Airline;

public class AirlineLogic {

	public List<Airline> findDestinationFlight(List<Airline> airlineArray, String destination) {

		List<Airline> airlineWithEqualDestination = new ArrayList<Airline>();
		for (int i = 0; i < airlineArray.size(); i++) {

			if (airlineArray.get(i).getDestination().compareTo(destination) == 0) {
				airlineWithEqualDestination.add(airlineArray.get(i));
			}
		}
		return airlineWithEqualDestination;
	}

	public List<Airline> findEqualDayWeekFlight(List<Airline> airlineArray, String day) {

		List<Airline> airlineWithEqualDay = new ArrayList<Airline>();
		for (int i = 0; i < airlineArray.size(); i++) {

			if (airlineArray.get(i).getWeekDay().compareTo(day) == 0) {
				airlineWithEqualDay.add(airlineArray.get(i));
			}
		}
		return airlineWithEqualDay;
	}

	public List<Airline> findEqualDayWeekAndTimeFlight(List<Airline> airlineArray, String day, int[] time) {

		List<Airline> airlineWithEqualDayAndTime = new ArrayList<Airline>();
		int hour = time[0];
		int minute = time[1];

		for (int i = 0; i < airlineArray.size(); i++) {

			if (airlineArray.get(i).getWeekDay().compareTo(day) == 0 & airlineArray.get(i).getDepartureHour() >= hour) {

				if (airlineArray.get(i).getDepartureHour() == hour) {

					if (airlineArray.get(i).getDepartureMinute() >= minute) {
						airlineWithEqualDayAndTime.add(airlineArray.get(i));

					} else {
						continue;
					}
				} else if (airlineArray.get(i).getDepartureHour() > hour) {
					airlineWithEqualDayAndTime.add(airlineArray.get(i));
				}

			}
		}
		return airlineWithEqualDayAndTime;
	}

}