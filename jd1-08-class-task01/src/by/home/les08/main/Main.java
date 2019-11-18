package by.home.les08.main;

import by.home.les08.entity.Test1;
import by.home.les08.logic.Test1Logic;
import by.home.les08.view.Test1View;

public class Main {

	public static void main(String[] args) {

		Test1 test = new Test1();

		test.setFirstVariable(100);
		test.setSecondVariable(50);

		Test1View view = new Test1View();
		Test1Logic logic = new Test1Logic();

		view.printSumOfVariables(logic, test);

		view.printMaxOfVariables(logic, test);
	}
}
