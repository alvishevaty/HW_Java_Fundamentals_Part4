package by.home.les08.entity;

public class Train {

	// название пункта назначения, номер поезда, время отправления

	private String destination;
	private String departure;

	private int trainNumber;

	private int departureHour;
	private int departureMinute;

	public Train() {

		destination = "null";
		departure = "null";
		trainNumber = 0;
		departureHour = 0;
		departureMinute = 0;
	}

	public Train(int trainNumber, String departure, String destination, int departureHour, int departureMinute) {
		this.destination = destination;
		this.departure = departure;
		this.trainNumber = trainNumber;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}

	public int getDepartureMinute() {
		return departureMinute;
	}

	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departure == null) ? 0 : departure.hashCode());
		result = prime * result + departureHour;
		result = prime * result + departureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departure == null) {
			if (other.departure != null)
				return false;
		} else if (!departure.equals(other.departure))
			return false;
		if (departureHour != other.departureHour)
			return false;
		if (departureMinute != other.departureMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

}
