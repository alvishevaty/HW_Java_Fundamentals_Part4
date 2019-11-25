package by.home.les08.logic;

import by.home.les08.entity.Time;

public class TimeLogic {

	public int[] changeTime(int[] arrayHourMinSec, Time time) {

		int[] exchange = new int[3];

		int setFirstHour = time.getHour();
		int setFirstMinute = time.getMinute();
		int setFirstSecond = time.getSecond();

		exchange[0] = (setFirstSecond + arrayHourMinSec[2]) % 60;
		int residue1 = (setFirstSecond + arrayHourMinSec[2]) / 60;
		exchange[1] = (setFirstMinute + arrayHourMinSec[1] + residue1) % 60;
		int residue2 = (setFirstMinute + arrayHourMinSec[1] + residue1) / 60;
		exchange[2] = (setFirstHour + arrayHourMinSec[0] + residue2) % 24;

		return exchange;
	}

}
