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

	/*
	public Student[] takeExcellentStudents(Student[] student) {

		Student[] hasMarksOverNine = new Student[student.length];
		Student[] nullSt = null;
		
		int j = 0;

		for (int i = 0; i < student.length; i++) {

			if (isExcellentStudent(student[i])) {
				hasMarksOverNine[j] = student[i];
				j++;
			}
		}

		if (j != 0) {
			return hasMarksOverNine;
		} else {
			return nullSt;
		}

	} 
	*/
}
