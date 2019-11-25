package by.home.les08.entity;

import java.util.Arrays;

public class Depo {

	private Train[] trains;

	private static final int TRAINS_COUNT = 5;

	public Depo() {
		trains = new Train[TRAINS_COUNT];
	}

	public Train[] getTrains() {
		return trains;
	}

	private int count = 0;
	public void setTrains(Train train) {
		this.trains[count] = train;
		count++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trains);
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
		Depo other = (Depo) obj;
		if (!Arrays.equals(trains, other.trains))
			return false;
		return true;
	}
}
