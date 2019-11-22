package by.home.les08.logic;

import by.home.les08.entity.Counter;

public class CounterLogic {

	Counter counter = new Counter();
	
	public int random() {
		int a = (int) (Math.random() * 900000 + 1);
		return a;
	}

	public int randomCountValue(boolean isDefault) {

		if (isDefault == true) {
			counter.setCount(0);
			return counter.getCount();
		}
		else {
			counter.setCount(random());
			return counter.getCount();
		}
	}
}
