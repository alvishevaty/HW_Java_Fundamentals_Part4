package by.home.les08.entity;

public class Airline {

	private String destination;
	private int flightNumber;
	private String airplaneType;
	private int departureHour;
	private int departureMinute;
	private String weekDay;

	public Airline() {
		this.destination = "";
		this.flightNumber = 0;
		this.airplaneType = "";
		this.departureHour = 0;
		this.departureMinute = 0;
		this.weekDay = "";
	}

	public Airline(String destination, int flightNumber, String airplaneType, int departureHour, int departureMinute,
			String weekDay) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
		this.weekDay = weekDay;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
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

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + departureHour;
		result = prime * result + departureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((weekDay == null) ? 0 : weekDay.hashCode());
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
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
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
		if (flightNumber != other.flightNumber)
			return false;
		if (weekDay == null) {
			if (other.weekDay != null)
				return false;
		} else if (!weekDay.equals(other.weekDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", departureHour=" + departureHour + ", departureMinute=" + departureMinute
				+ ", weekDay=" + weekDay + "]";
	}

}
