package by.home.les08.main;

import by.home.les08.entity.Time;
import by.home.les08.logic.TimeLogic;
import by.home.les08.view.TimeView;

public class Main {

	public static void main(String[] args) {

		final Time time = new Time();
		final TimeLogic timeLogic = new TimeLogic();
		final TimeView timeView = new TimeView();

		time.setHour(18);
		time.setMinute(34);
		time.setSecond(53);

		int[] newTime = timeLogic.changeTime(timeView.setUserTime(), time);

		System.out.println("Начальное время:");
		timeView.printTime(time.getHour(), time.getMinute(), time.getSecond());
		System.out.println("Измененное время:");
		timeView.printTime(newTime);

	}

}
