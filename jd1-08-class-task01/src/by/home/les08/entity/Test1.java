package by.home.les08.entity;

public class Test1 {

	private int firstVariable;
	private int secondVariable;
	

	public int getFirstVariable() {
		return firstVariable;
	}

	public void setFirstVariable(int firstVariable) {
		this.firstVariable = firstVariable;
	}

	public int getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(int secondVariable) {
		this.secondVariable = secondVariable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstVariable;
		result = prime * result + secondVariable;
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
		Test1 other = (Test1) obj;
		if (firstVariable != other.firstVariable)
			return false;
		if (secondVariable != other.secondVariable)
			return false;
		return true;
	}

}
