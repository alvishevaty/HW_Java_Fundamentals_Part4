package by.home.les08.main;

import by.home.les08.entity.Counter;
import by.home.les08.logic.CounterLogic;
import by.home.les08.view.CounterView;

public class Main {

	public static void main(String[] args) {
		
		Counter count = new Counter();
		CounterLogic counterLogic = new CounterLogic();
		CounterView counterView = new CounterView();
		
		int randomValue = counterLogic.randomCountValue(false);
		
		counterView.printElement(counterLogic.randomCountValue(true), "Дефолтное значение: ");
				
		counterView.printElement(randomValue, "Рандомное значение: ");
		
		counterView.printElement(count.elementIncrement(randomValue), "Значение счетчика увеличенное на 1: ");
		
		counterView.printElement(count.elementDecrement(randomValue), "Значение счетчика уменьшенное на 1: ");

	}

}
