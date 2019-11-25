package by.home.les08.logic;

import by.home.les08.entity.Depo;
import by.home.les08.entity.Train;

public class DepoLogic {

	Depo depo = new Depo();

	public Train[] sort(Train[] depo) {

		for (int i = 0; i < depo.length; i++) {

			int min = depo[i].getTrainNumber();

			for (int j = 0; j < depo.length - i - 1; j++) {

				if (min > depo[j + 1].getTrainNumber()) {

					Train temp = depo[j];
					depo[j] = depo[j + 1];
					depo[j + 1] = temp;

				}
			}
		}

		return depo;
	}

	public Train trainInfo(int number, Train[] trains) {

		Train findTrain = new Train();

		for (int i = 0; i < trains.length; i++) {

			if (trains[i].getTrainNumber() == number) {
				findTrain = trains[i];
				break;
			} else {
				findTrain = null;
			}
		}
		return findTrain;
	}

	public Train[] sortDestination(Train[] depo) {

		for (int i = 0; i < depo.length; i++) {

			for (int j = 0; j < depo.length - 1; j++) {

				if (depo[j].getDestination().compareTo(depo[j + 1].getDestination()) > 1) {

					Train temp = depo[j];
					depo[j] = depo[j + 1];
					depo[j + 1] = temp;
				}
			}
		}
		return depo;
	}

	public Train[] sortDepTime(Train[] depo) {

		for (int i = 0; i < depo.length; i++) {

			for (int j = 0; j < depo.length - 1; j++) {

				if (depo[j].getDestination().compareTo(depo[j + 1].getDestination()) == 0
						& depo[j].getDepartureHour() >= depo[j + 1].getDepartureHour()) {

					if (depo[j].getDepartureHour() > depo[j + 1].getDepartureHour()) {
						Train temp = depo[j];
						depo[j] = depo[j + 1];
						depo[j + 1] = temp;
					
					} else if (depo[j].getDepartureHour() == depo[j + 1].getDepartureHour()) {
						if (depo[j].getDepartureMinute() < depo[j + 1].getDepartureMinute()) {
							Train temp = depo[j];
							depo[j] = depo[j + 1];
							depo[j + 1] = temp;
						}
					}
				}
			}
		}
		return depo;
	}
}
