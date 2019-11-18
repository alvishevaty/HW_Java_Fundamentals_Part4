package by.home.les08.logic;

import by.home.les08.entity.Test1;

public class Test1Logic {

	public int sumOfVariables(Test1 test) {

		int sum;

		sum = test.getFirstVariable() + test.getSecondVariable();

		return sum;
	}

	public int maxOfVariables(Test1 test) {

		int max;

		if (test.getFirstVariable() >= test.getSecondVariable()) {
			max = test.getFirstVariable();
		} else {
			max = test.getSecondVariable();
		}

		return max;
	}
	

}
