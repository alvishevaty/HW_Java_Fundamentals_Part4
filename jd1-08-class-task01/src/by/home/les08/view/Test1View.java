package by.home.les08.view;

import by.home.les08.entity.Test1;
import by.home.les08.logic.Test1Logic;

public class Test1View {

	public void printVatiables(Test1 test) {

		System.out.println("Переменная 1: " + test.getFirstVariable());
		System.out.println("Переменная 2: " + test.getSecondVariable());

	}

	public void printSumOfVariables(Test1Logic sum, Test1 test) {

		System.out.print("Сумма переменных: ");
		System.out.print(test.getFirstVariable());
		System.out.print(" + ");
		System.out.print(test.getSecondVariable());
		System.out.print(" = ");
		System.out.println(sum.sumOfVariables(test));

	}

	public void printMaxOfVariables(Test1Logic max, Test1 test) {

		System.out.print("Максимальная переменная из ");
		System.out.print(test.getFirstVariable());
		System.out.print(" и ");
		System.out.print(test.getSecondVariable());
		System.out.print(" - это ");
		System.out.println(max.maxOfVariables(test));

	}

}
