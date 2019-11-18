package by.home.les08.entity;

public class Test2 {

	private int firstVariable;
	private int secondVariable;

	public Test2(int firstVariable, int secondVariable) {
		this.firstVariable = firstVariable;
		this.secondVariable = secondVariable;
	}

	public Test2() {
		this.firstVariable = 11;
		this.secondVariable = 12;
	}

	public int getFirstVariable() {
		return firstVariable;
	}

	public int getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(int secondVariable) {
		this.secondVariable = secondVariable;
	}

	public void setFirstVariable(int firstVariable) {
		this.firstVariable = firstVariable;
	}
}