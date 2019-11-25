package by.home.les08.logic;

import by.home.les08.entity.Student;

public class StudentLogic {

	public boolean isExcellentStudent(Student student) {

		int[] marks = student.getMarks();

		int count = 0;

		for (int x : marks) {

			if (x == 9 | x == 10) {
				count++;
			} else {
				break;
			}
		}

		if (count == marks.length) {
			return true;
		} else {
			return false;
		}
	}

}
