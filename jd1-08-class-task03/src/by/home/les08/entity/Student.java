package by.home.les08.entity;

import java.util.Arrays;

public class Student {

	private String surname;
	private String initials;

	private static final int MARK_COUNT = 5;
	private int[] marks = new int[MARK_COUNT];

	public Student() {
		surname = "null";
		initials = "null";

		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}

	}

	public Student(String surname, String initials, int[] marks) {
		this.surname = surname;
		this.initials = initials;
		this.marks = marks;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int mark1, int mark2, int mark3, int mark4, int mark5) {
		this.marks[0] = mark1;
		this.marks[1] = mark2;
		this.marks[2] = mark3;
		this.marks[3] = mark4;
		this.marks[4] = mark5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (initials == null) {
			if (other.initials != null)
				return false;
		} else if (!initials.equals(other.initials))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}